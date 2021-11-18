package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dog;
import com.example.demo.service.DogsService;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogsController {

	public DogsController() {
		System.out.println("DogsController called");
		System.out.println("some changes");
	}

	private DogsService service;
	
	@Autowired
	public void setService(DogsService service) {
		System.out.println("DogsController setter called");
		this.service = service;
	}

	@GetMapping
	public List<Dog> getDogs() {
		return service.getDogs();
	}


}