package repositories;

import domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    @Override
    List<Customer> findAll();
    List<Customer> findByCountry(String country);
    @Query("select distinct c.firstname,c.lastname from Customer c where c.address.city='Amsterdam'")
    List<String> findByFirstnameAndLastname();
}
