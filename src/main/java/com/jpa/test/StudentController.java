package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllUsers() {

		List<Student> studentList = studentRepository.findAll();

		System.out.println(studentList.get(0).getMarks());

		return ResponseEntity.status(HttpStatus.OK).body(studentList);
	}

	@GetMapping("/save")
	public ResponseEntity<List<Student>> saveStudent(@RequestParam int id, @RequestParam String name,
			@RequestParam int marks) {
		Student s = new Student();
		s.setId(id);
		s.setMarks(marks);
		s.setName(name);
		studentRepository.save(s);
		return ResponseEntity.status(HttpStatus.OK).body(studentRepository.findAll());
	}

	@GetMapping("/getbyid")
	public Student getStundetById(@RequestParam int id) {
		Optional<Student> student = studentRepository.findById(id);

		if (student.isPresent()) {
			return student.get();
		}

		return null;
	}

	@DeleteMapping("/deletebyid")
	public void deleteStudentById(@RequestParam int id) {
		studentRepository.deleteById(id);

	}
	@GetMapping("/getByMarks")
	public ResponseEntity<List<Student>> getByMark(@RequestParam int mark){
		
		return ResponseEntity.status(HttpStatus.OK).body(studentRepository.findByQuery1(mark));
	}
}
