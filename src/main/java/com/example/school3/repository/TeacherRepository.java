package com.example.school3.repository;

import com.example.school3.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	Teacher findByFullName(String name);
}

