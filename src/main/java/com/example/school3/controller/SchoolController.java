package com.example.school3.controller;

import com.example.school3.models.Group;
import com.example.school3.models.Schedule;
import com.example.school3.models.ScheduleSubject;
import com.example.school3.models.Student;
import com.example.school3.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class SchoolController
{
	@Autowired
	SchoolService schoolService;


	@GetMapping("/schedule/teacher")
	public List<ScheduleSubject> scheduleByTeacher(
			@RequestParam String name
	) {
		return schoolService.findByTeacherName(name);
	}

	@GetMapping("/schedule/group")
	public Set<Schedule> scheduleByGroup(@RequestParam int id
	) {
		return schoolService.findScheduleByGroupId(id);
	}

	@GetMapping("/group/students")
	public Set<Student>    groupByNumber(@RequestParam int id
	) {
		return schoolService.findStudentsGroupById(id);
	}




}
