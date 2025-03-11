package com.mohsin.subjectservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Subject {
	
	@Id
	private long id;
	private String name;
	private String auther;
	
}
