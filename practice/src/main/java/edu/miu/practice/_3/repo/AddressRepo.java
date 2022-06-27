package edu.miu.practice._3.repo;

import edu.miu.practice._3.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
