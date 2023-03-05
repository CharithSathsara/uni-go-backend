package lk.madhack.codeduo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "course")
public class Course {
	
	public Course() {
		super();
	}
	
	public Course(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id")
	private Integer course_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	

}
