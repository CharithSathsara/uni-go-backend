package lk.madhack.codeduo.response;

import lk.madhack.codeduo.model.Student;
import lombok.Data;

@Data
public class StudentResponse {
	
	private String message;
	private String code;
	private Student student;

}
