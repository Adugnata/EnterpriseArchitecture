package edu.miu.practice._4.app;

import edu.miu.practice._4.domain.Address;
import edu.miu.practice._4.domain.Company;
import edu.miu.practice._4.domain.ContactData;
import edu.miu.practice._4.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("edu.miu.practice._4.domain")
@EnableJpaRepositories("edu.miu.practice._4.repo")
@ComponentScan("edu.miu.practice._4")
public class Application implements CommandLineRunner {
    @Autowired
    ICompanyService service;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        Company company = new Company("MIU","https://www.miu.edu");
        company.addEmployee("John","john.doe@miu.edu",new Address("1000 N 4th st","Fairfield","52557"));
        company.setContactData(new ContactData("1234","miu@miu.edu","miu"));
        service.save(company);
        service.findCompanyByName("MIU").forEach(System.out::println);
        service.findStreetByCityAndZip("Fairfield","52557").forEach(System.out::println);
        service.FindNameByCity("Fairfield").forEach(System.out::println);
        service.findByPhone("1234").forEach(System.out::println);
        service.findCompanyByEmployeeName("John").forEach(System.out::println);

    }
}
