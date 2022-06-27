package edu.miu.bank;

import edu.miu.bank.dao.AccountDAO;
import edu.miu.bank.domain.Account;
import edu.miu.bank.logging.ILogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import java.util.Objects;

@Aspect
@Configuration
public class TraceAdvice {
    @Autowired
    ILogger logger;

    @After("execution(* edu.miu.bank.dao.AccountDAO.*(..))")
    public void traceaftermethod(JoinPoint joinpoint) {
        Object[] args = joinpoint.getArgs();
        if (args.length > 0) {
            if (!Objects.equals(joinpoint.getSignature().getName(), "loadAccount")) {
                Account account = (Account) args[0];
                logger.log("AccountDAO: " + joinpoint.getSignature().getName() + " with accountnr =" + account.getAccountnumber());
            } else logger.log("AccountDAO: " + joinpoint.getSignature().getName() + " with accountnr =" + args[0]);
        }
    }

    @Around("execution(* edu.miu.bank.service.AccountService.*(..))")
    public Object invoke(ProceedingJoinPoint call) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start(call.getSignature().getName());
        Object retVal = call.proceed();
        sw.stop();
        logger.log(call.getSignature().getName() + ": Completion time " +  " = " + sw.getLastTaskTimeMillis() + " ms");
        return retVal;
    }

    @After("execution(* edu.miu.bank.jms.JMSSender.*(..)) && args(text)")
    public void jmsSender(JoinPoint joinpoint, String text) {
        logger.log("JMSSender: sending JMS message =" + text);
    }
}
