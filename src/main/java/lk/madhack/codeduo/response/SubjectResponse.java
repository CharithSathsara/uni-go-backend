package lk.madhack.codeduo.response;

import lk.madhack.codeduo.model.Subject;
import lombok.Data;

@Data
public class SubjectResponse {
	
	private String message;
	private String code;
	private Iterable<Subject> subjects;

}
