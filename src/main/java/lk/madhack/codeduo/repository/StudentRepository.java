package lk.madhack.codeduo.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import lk.madhack.codeduo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	@Query("SELECT s FROM Student s WHERE email=:email")
	public Student getDetails(@Param(value="email")String email);

}
