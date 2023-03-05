package lk.madhack.codeduo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import lk.madhack.codeduo.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Integer>{
	
	@Query("SELECT s FROM Subject s WHERE course_id=:course_id")
	public Iterable<Subject> getSubjects(@Param(value="course_id")Integer course_id);

}
