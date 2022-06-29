package edu.miu.bank.repositories;

import edu.miu.bank.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Transactional(propagation = Propagation.REQUIRED)
    default void saveAccount(Account account){
        save(account);
    }

}




