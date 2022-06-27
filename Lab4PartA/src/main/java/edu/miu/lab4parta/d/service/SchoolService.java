package edu.miu.lab4parta.d.service;

import edu.miu.lab4parta.d.domain.School;
import edu.miu.lab4parta.d.repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService implements ISchoolService{
    @Autowired
    SchoolRepo schoolRepo;
    @Override
    public void save(School school) {
        schoolRepo.save(school);
    }
}
