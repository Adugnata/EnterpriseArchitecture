package edu.miu.lab8partb.hsql.repo;


import edu.miu.lab8partb.hsql.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
