package lk.madhack.codeduo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lk.madhack.codeduo.model.Announcement;
import lk.madhack.codeduo.model.Course;
import lk.madhack.codeduo.model.Event;
import lk.madhack.codeduo.model.LoginDetails;
import lk.madhack.codeduo.model.Student;
import lk.madhack.codeduo.model.Subject;
import lk.madhack.codeduo.response.StudentResponse;
import lk.madhack.codeduo.service.UniGoService;

@RestController
public class UniGoController {
	
	@Autowired
	UniGoService uniGoService;
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getAllStudents(){
		return uniGoService.getAllStudents();
	}
	
	@PostMapping("/register")
	public StudentResponse register(@RequestBody Student student) {
		return uniGoService.register(student);
	}
	
	@PostMapping("/login")
	public StudentResponse login(@RequestBody LoginDetails loginDetails) {
		return uniGoService.login(loginDetails);
	}
	
	@GetMapping("/getAllCourses")
	public Iterable<Course> getAllCourses(){
		return uniGoService.getAllCourses();
	}
	
	@GetMapping("/getAllSubjects")
	public Iterable<Subject> getAllSubjects(){
		return uniGoService.getAllSubjects();
	}
	
	@GetMapping("/getAllEvents")
	public Iterable<Event> getAllEvents(){
		return uniGoService.getAllEvents();
	}
	
	@GetMapping("/getAllAnnouncements")
	public Iterable<Announcement> getAllAnnouncements(){
		return uniGoService.getAllAnnouncements();
	}
	
	@GetMapping("/getSubjects/{course_id}")
	public Iterable<Subject> getSubjects(@PathVariable Integer course_id) {
		return uniGoService.getSubjects(course_id);
	}

}
