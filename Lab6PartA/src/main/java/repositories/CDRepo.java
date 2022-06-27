package repositories;

import domain.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CDRepo extends JpaRepository<CD,Long> {
    List<CD> findByArtist(String artist);
    List<CD> findByArtistAndPriceLessThan(String artist,double amount);
    @Query(value = "select distinct c from CD c where c.artist=:artist and c.price>:price")
    List<CD> findByArtistAndPriceGreaterThan(@Param("artist") String artist, @Param("price") double price);
    @Query(value = "select  * from CD d join PRODUCT p on d.id = p.id where d.artist = 'U2'",nativeQuery = true)
    List<CD> findByArtistU2();
}
