package bank.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import bank.domain.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
