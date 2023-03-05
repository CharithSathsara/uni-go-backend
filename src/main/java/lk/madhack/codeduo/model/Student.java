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
@Table(name = "student")
public class Student {
	
	public Student() {
		super();
	}
	
	public Student(String name, String email, String indexNo, String password) {
		super();
		this.name = name;
		this.email = email;
		this.indexNo = indexNo;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stdid")
	private Integer stdid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "index_no")
	private String indexNo;
	
	@Column(name = "password")
	private String password;
	

}
