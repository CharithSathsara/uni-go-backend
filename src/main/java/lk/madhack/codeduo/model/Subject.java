package lk.madhack.codeduo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "subject")
public class Subject {
	
	public Subject() {
		super();
	}
	
	public Subject(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sub_id")
	private Integer sub_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
	private Course course;

}
