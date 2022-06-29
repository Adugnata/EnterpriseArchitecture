package edu.miu.practice._4.service;

import edu.miu.practice._4.domain.Company;

import java.util.List;

public interface ICompanyService {
    void save(Company company);
    List<Company> findCompanyByName(String name);
    List<String> findStreetByCityAndZip(String city, String zip);
    List<String> FindNameByCity(String city);
    List<Company> findByPhone(String phone);
    List<Company> findCompanyByEmployeeName(String name);

}
