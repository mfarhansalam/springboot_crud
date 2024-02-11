package com.example.SpringBootCRUD.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootCRUD.bean.Subject;
import com.example.SpringBootCRUD.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects(){
		
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
}
