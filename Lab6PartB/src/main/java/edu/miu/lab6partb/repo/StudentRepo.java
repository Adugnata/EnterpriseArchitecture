package edu.miu.lab6partb.repo;

import edu.miu.lab6partb.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
   List<Student> findByName(String name);
    @Query(value = "select s from Student s join fetch s.department d where d.name = :dep")
    List<Student> findByDepartment(@Param("dep") String dep);
    @Query(value = "select s from Student s join fetch s.grades g join fetch g.course c where c.name =:course")
    List<Student> findStudentByCourse(@Param("course") String course);
}
