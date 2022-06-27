package repositories;

import domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    @Query(value = "select distinct o.ordernr from Order o where o.status='closed'")
    List<String> findOrdersByStatus();

    @Query("select distinct o.ordernr from Order o where o.customer.address.city=:city")
    List<String> findByCity(@Param("city") String city);

    @Query(value = "select distinct o.ordernr from Order o join o.orderlines ol join ol.product p")
    List<String> findByContainCD();
}
