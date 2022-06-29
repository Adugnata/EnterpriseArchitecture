package edu.miu.practice._7.repo;

import edu.miu.practice._7.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long> {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    default void saveAccount(Account account) {
        save(account);
    }
}
