package lk.madhack.codeduo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lk.madhack.codeduo.model.Announcement;
import lk.madhack.codeduo.model.Course;
import lk.madhack.codeduo.model.Event;
import lk.madhack.codeduo.model.LoginDetails;
import lk.madhack.codeduo.model.Student;
import lk.madhack.codeduo.model.Subject;
import lk.madhack.codeduo.repository.AnnouncementRepository;
import lk.madhack.codeduo.repository.CourseRepository;
import lk.madhack.codeduo.repository.EventRepository;
import lk.madhack.codeduo.repository.StudentRepository;
import lk.madhack.codeduo.repository.SubjectRepository;
import lk.madhack.codeduo.response.StudentResponse;

@Service
public class UniGoService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	EventRepository eventRepository;
	
	@Autowired
	AnnouncementRepository announcementRepository;

	public Iterable<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public StudentResponse register(Student student) {
		
		StudentResponse response = new StudentResponse();
		
		Student st = new Student(student.getName(), student.getEmail(),student.getIndexNo(), student.getPassword());
		
		
		try {
			Student std = studentRepository.save(st);
			
			response.setCode("1");
			response.setMessage("Succesfully Registerd");
			response.setStudent(std);
			return response;
		}
		catch(Exception e){
			response.setCode("-1");
			response.setMessage("something went wrong ");
			return response;
		}
		
	}

	public StudentResponse login(LoginDetails loginDetails) {
		
		StudentResponse response = new StudentResponse();
		
		try {
			
			Student student = studentRepository.getDetails(loginDetails.getEmail());
			
			if(student == null) {
				response.setMessage("Email is incorrect");
				response.setCode("-1");
			}
			else {
				
				if(loginDetails.getPassword().equals(student.getPassword())) {
					response.setMessage("Login Success!");
					response.setCode("1");
					response.setStudent(student);
				}else {
					response.setMessage("Password Incorrect!");
					response.setCode("-1");
				}
				
			}
		} catch (Exception e) {
			response.setMessage("Error occured!");
			response.setCode("-1");
		}
		
		return response;
		
	}

	public Iterable<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public Iterable<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	public Iterable<Event> getAllEvents() {
		return eventRepository.findAll();
	}

	public Iterable<Announcement> getAllAnnouncements() {
		return announcementRepository.findAll();
	}

	public Iterable<Subject> getSubjects(Integer course_id) {
		
		
		try {
			
			Iterable<Subject> sub = subjectRepository.getSubjects(course_id);
			
			if(sub == null) {
				return null;
			}else {
				return sub;
			}
		} catch (Exception e) {
			return null;		
		}
		
	}

}
