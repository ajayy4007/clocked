package com.jpa.test;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Query("SELECT s FROM Student s WHERE s.marks > :mark")
	List<Student> findByQuery1(@Param("mark") int marks);

}
