package com.example.school3.repository;

import com.example.school3.models.ScheduleSubject;
import com.example.school3.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface ScheduleSubjectRepository extends JpaRepository<ScheduleSubject, Integer>
{
	//@Override
	//List<ScheduleSubject> findAll();
	List<ScheduleSubject> findByTeacher(Teacher teacher);

}
