package edu.miu.lab6partb.repo;

import edu.miu.lab6partb.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Course,Long> {

}
