package edu.miu.lab2part2;

import edu.miu.lab2part2.integration.EmailSender;
import edu.miu.lab2part2.integration.ILogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

@Aspect
@Configuration
public class TraceAdvice {
    @Autowired
    ILogger logger;

    @After("execution(* edu.miu.lab2part2.integration.EmailSender.*(..))")
    public void traceaftermethod(JoinPoint joinpoint) {
        EmailSender emailSender = (EmailSender) joinpoint.getTarget();
        Object[] args = joinpoint.getArgs();
        logger.log("Email is sent: message= " + args[0] + " , emailaddress =" + args[1]);
        logger.log(emailSender.getOutgoingMailServer());
        System.out.println("after execution of method " + joinpoint.getSignature().getName());
    }
    @Around("execution(* edu.miu.lab2part2.dao.CustomerDAO.*(..))")
    public Object invoke(ProceedingJoinPoint call) throws Throwable{
        StopWatch sw = new StopWatch();
        sw.start(call.getSignature().getName());
        Object retVal = call.proceed();
        sw.stop();
        logger.log(call.getSignature().getName() + ": Completion time " +  " = " + sw.getLastTaskTimeMillis() + " ms");
        return retVal;
    }

}
