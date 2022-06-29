package edu.miu.practice._5.repo;

import edu.miu.practice._5.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
}
