package edu.miu.lab4parta.d.repo;

import edu.miu.lab4parta.d.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School,Long> {
}
