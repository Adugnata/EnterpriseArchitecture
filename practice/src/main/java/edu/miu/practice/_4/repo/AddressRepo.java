package edu.miu.practice._4.repo;

import edu.miu.practice._4.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address,Long> {
    @Query("select a.street from Address a where a.city =:city and a.zip =:zip")
    List<String> findStreetByCityAndZip(String city, String zip);
}
