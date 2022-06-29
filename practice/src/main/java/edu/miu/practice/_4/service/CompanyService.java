package edu.miu.practice._4.service;

import edu.miu.practice._4.domain.Company;
import edu.miu.practice._4.repo.AddressRepo;
import edu.miu.practice._4.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {
    @Autowired
    CompanyRepo companyRepo;
    @Autowired
    AddressRepo addressRepo;

    @Override
    public void save(Company company) {
        companyRepo.save(company);
    }

    @Override
    public List<Company> findCompanyByName(String name) {
        return companyRepo.findCompanyByName(name);
    }

    @Override
    public List<String> findStreetByCityAndZip(String city, String zip) {
        return addressRepo.findStreetByCityAndZip(city, zip);
    }

    @Override
    public List<String> FindNameByCity(String city) {
        return companyRepo.FindNameByCity(city);
    }

    @Override
    public List<Company> findByPhone(String phone) {
        return companyRepo.findByPhone(phone);
    }

    @Override
    public List<Company> findCompanyByEmployeeName(String name) {
        return companyRepo.findCompanyByEmployeeName(name);
    }
}
