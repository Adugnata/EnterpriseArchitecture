package repositories;

import domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
    @Query(value = "select * from ADDRESS  where city = 'Amsterdam'",nativeQuery = true)
    List<String> findByCity();
}
