package com.mohsin.subjectservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohsin.subjectservice.entity.Subject;
import com.mohsin.subjectservice.reposetory.SubjectReposetory;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectReposetory reposetory;
	
	public Subject saveSubject(Subject subject) {
		return reposetory.save(subject);
	}
	
	public Optional<Subject> getSubjectById(long id){
		return reposetory.findById(id);
	}
	
	public List<Subject> getAllSubject(){
		return reposetory.findAll();
	}

}
