package com.lm.manage.dao;

import com.lm.manage.domain.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by asus on 2018/3/6.
 */
public interface DogRepository extends MongoRepository<Dog,String> {
    public List<Dog> findByAge(Integer age);
}
