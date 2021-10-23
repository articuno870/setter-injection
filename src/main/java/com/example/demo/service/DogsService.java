package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DogsDao;
import com.example.demo.model.Dog;

import java.util.List;

@Component
public class DogsService {
    private DogsDao dao;

    public List<Dog> getDogs() {
        System.out.println("DogsService.getDogs called");
        return dao.getAllDogs();
    }

    @Autowired
    public void setDao(DogsDao dao) {
        System.out.println("DogsService setter called");
        this.dao = dao;
    }

    public DogsService(){
        System.out.println("DogsService no-arg constructor called");
    }
    public DogsService(DogsDao dao) {
        System.out.println("DogsService arg constructor called");
        this.dao = dao;
    }
}