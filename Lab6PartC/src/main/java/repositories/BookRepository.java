package repositories;

import domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;


public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    @Modifying
    @Query(value = "delete from Book b where b.publicationYear < :year")
    void deleteByPublicationYear(@Param("year") int year);

    @Transactional
    @Modifying
    @Query(value = "update Book b set b.locationCode = concat( 'BB', b.locationCode)")
    void changeLocationCode();
}
