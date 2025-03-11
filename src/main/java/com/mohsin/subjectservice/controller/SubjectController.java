package com.mohsin.subjectservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohsin.subjectservice.entity.Subject;
import com.mohsin.subjectservice.service.SubjectService;

@RestController
@RequestMapping(value = "/api/subject")
public class SubjectController {

	@Autowired
	private SubjectService service;
	
	@PostMapping
	public Subject saveSubjectCongtroller(@RequestBody Subject subject) {
		return service.saveSubject(subject);
	}
	
	@GetMapping(value = "/id/{id}")
	public Optional<Subject> findSubjectByIdController(@PathVariable long id){
		return service.getSubjectById(id);
	}
	
	@GetMapping
	public List<Subject> findAllSubjectController(){
		return service.getAllSubject();
	}
}
