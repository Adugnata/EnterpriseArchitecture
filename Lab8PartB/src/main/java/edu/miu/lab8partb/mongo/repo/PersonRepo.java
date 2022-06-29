package edu.miu.lab8partb.mongo.repo;

import edu.miu.lab8partb.mongo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepo extends MongoRepository<Person,Integer> {
}
