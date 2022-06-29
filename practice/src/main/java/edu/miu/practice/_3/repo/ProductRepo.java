package edu.miu.practice._3.repo;

import edu.miu.practice._3.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,String> {
List<Product> findByCategory(String category);
@Query("select p from Product p where p.price > :price")
List<Product> findByPriceIsGreaterThan(@Param("price") double price);
}
