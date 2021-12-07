package com.example.school3.repository;

import com.example.school3.models.Subject;
import com.example.school3.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer>
{
	//Subject findByTeacher(Teacher teacher);

}
