package com.example.demo.dao;

import org.springframework.stereotype.Component;

import com.example.demo.model.Dog;

import java.util.List;

@Component
public class DogsDao {
	public DogsDao() {
		System.out.println("DogsDao no-arg constructor called");
	}

	public List<Dog> getAllDogs() {
		System.out.println("DogsDao.getAllDogs called");
		return null;
	}
}