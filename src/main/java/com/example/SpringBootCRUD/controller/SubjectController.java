package com.example.SpringBootCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCRUD.bean.Subject;
import com.example.SpringBootCRUD.services.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	public SubjectService subjectService;

	@RequestMapping("/subjects")
	public List<Subject> getAllSubject(){
		return subjectService.getAllSubjects();
	}
}
