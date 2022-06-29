package edu.miu.practice._6.repo;

import edu.miu.practice._6.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
}
