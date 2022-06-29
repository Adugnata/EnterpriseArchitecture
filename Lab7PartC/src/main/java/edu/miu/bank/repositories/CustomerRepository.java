package edu.miu.bank.repositories;

import edu.miu.bank.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    default void saveCustomer(Customer customer) {
    throw new RuntimeException("could not save customer");
    //   save(customer);
    }
}




