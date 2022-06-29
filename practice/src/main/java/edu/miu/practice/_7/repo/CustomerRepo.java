package edu.miu.practice._7.repo;

import edu.miu.practice._7.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    default void saveCustomer(Customer customer) {
        throw new RuntimeException("could not save customer");
        // save(customer);
    }
}
