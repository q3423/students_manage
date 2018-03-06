package com.lm.manage.dao;

import com.lm.manage.domain.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by asus on 2018/3/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DogRepositoryTest {
    @Autowired
    DogRepository collectionRepository;
    @Test
    public void getList(){
        List<Dog> dogs = collectionRepository.findAll();
        System.out.println(dogs);
    }
}