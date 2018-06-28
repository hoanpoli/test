package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.model.SampleTable;
import com.example.test.dal.SampleTableDao;

@SpringBootApplication
@RestController
@RequestMapping("/sampletable")
public class SampleTableController {
	@Autowired
	private SampleTableDao dao;
	
	@GetMapping("/sampletable")
	public ResponseEntity<?> getAllAccountOfOwner(){
		Iterable<SampleTable> res = dao.findAll() ;
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
