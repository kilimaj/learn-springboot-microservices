package dev.kilima.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.kilima.springboot.bean.Student;

@RestController
public class StudentController {

	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student(1, "John", "Kilima");
		return student;
	}

	// http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John", "Kilima"));
		students.add(new Student(2, "Mabula", "Kilima"));
		students.add(new Student(3, "Barnabas", "Kilima"));
		students.add(new Student(4, "Gabriel", "Kilima"));
   
		return students;
	}

	// Springboot Rest API with path variable
	// {id} - URI template variable
	// http://localhost:8080/student-byid/1
	@GetMapping("student-byid/{id}")
	public Student studentPathVariable(@PathVariable int id) {
		return new Student(id, "John", "Kilima");
	}

	// When the URI template variable name is different
	// http://localhost:8080/student-byname/John
	@GetMapping("student-byname/{name}")
	public Student studentNewPathVariable(@PathVariable("name") String firstName) {
		return new Student(1, firstName, "Kilima");
	}

	// Can also accommodate multiple variables
	// http://localhost:8080/student-full/1/John/Kilima
	@GetMapping("student-full/{id}/{firstName}/{lastName}")
	public Student studentNewPathVariable(@PathVariable("id") int studentId, @PathVariable String firstName,
			@PathVariable String lastName) {
		return new Student(studentId, firstName, lastName);
	}

	// Springboot REST API with Request Param
	// http://localhost:8080/student-param?id=1&firstName=MAbula&lastName=Jean

	@GetMapping("student-param")
	public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName,
			@RequestParam String lastName) {
		return new Student(id, firstName, lastName);
	}
}
