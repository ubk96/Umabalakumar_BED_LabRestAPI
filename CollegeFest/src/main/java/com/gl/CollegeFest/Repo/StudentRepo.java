package com.gl.CollegeFest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CollegeFest.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
}
