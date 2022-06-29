package edu.miu.practice._4.repo;

import edu.miu.practice._4.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepo extends JpaRepository<Company,Long> {

    List<Company> findCompanyByName(String name);
    @Query("select distinct c.name from Company c join c.employees e where e.address.city = :city")
    List<String> FindNameByCity(@Param("city") String city);
    @Query("select c from Company c where c.contactData.phone=:phone")
    List<Company> findByPhone(@Param("phone") String phone);
    @Query("select distinct c from Company c join c.employees e where e.name=:name")
    List<Company> findCompanyByEmployeeName(@Param("name") String name);
}
