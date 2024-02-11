package com.example.SpringBootCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootCRUD.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	
}
