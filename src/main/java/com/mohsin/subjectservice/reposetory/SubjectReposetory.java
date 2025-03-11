package com.mohsin.subjectservice.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohsin.subjectservice.entity.Subject;

@Repository
public interface SubjectReposetory extends JpaRepository<Subject, Long> {

}
