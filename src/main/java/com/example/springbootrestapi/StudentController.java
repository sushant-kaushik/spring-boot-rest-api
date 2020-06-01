package com.example.springbootrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vo.Student;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@GetMapping("/students/{id}")
	
	public Student getStudent(@PathVariable(value = "id") Long studentId) {
		Student student = new Student("Sushant","Kaushik",studentId,35);
		return student;
	}
}
