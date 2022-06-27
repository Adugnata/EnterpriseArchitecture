package edu.miu.practice._3.repo;

import edu.miu.practice._3.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Long> {
}
