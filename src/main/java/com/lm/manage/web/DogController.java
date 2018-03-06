package com.lm.manage.web;

import com.lm.manage.dao.DogRepository;
import com.lm.manage.domain.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@Title: DogController
 *@Author:LiMan
 *@Date:2018/3/6 9:57
 *@Description: 
 */
@RestController
public class DogController  {
    @Autowired
    private DogRepository dogRepository;
    @GetMapping("/dogs")
    public List<Dog> findAll(){
        return dogRepository.findAll();
    }
    @PostMapping("/dogs")
    public Dog add(@ModelAttribute Dog dog){
        return dogRepository.save(dog);
    }
    @GetMapping("/dogs/age/{age}")
    public List<Dog> findByAge(@PathVariable("age") Integer age){
        return dogRepository.findByAge(age);
    }
    @DeleteMapping("/dogs/{id}")
    public void deleteDog(@PathVariable("id") String id ){
         dogRepository.deleteById(id);
    }
    @PostMapping("/dogs/update")
    public Dog updateDog(@ModelAttribute Dog dog){
        return dogRepository.save(dog);
    }

}
