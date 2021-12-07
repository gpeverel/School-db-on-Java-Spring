package com.example.school3.service;

import com.example.school3.models.*;
import com.example.school3.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SchoolService
{

	private final ScheduleRepository    schoolRepo;
	private final TeacherRepository     teacherRepo;
	private final GroupRepository       groupRepo;
	private final SubjectRepository     subjectRepo;
	private final ScheduleSubjectRepository ssRepo;

	public List<ScheduleSubject> findByTeacherName(String name)
	{
		Teacher teacher = teacherRepo.findByFullName(name);
//		ssRepo.findAll();
		//System.out.println(teacher.getFullName());
		List<ScheduleSubject> ss = ssRepo.findByTeacher(teacher);

		//Set<Schedule> schedules = schoolRepo.findAllByScheduleSubjectListContains(ss.get(0));



		return ss;
//		return null;
	}



	public Set<Student> findStudentsGroupById(int id)
	{
		Group group = groupRepo.findById(id);
		return group.getStudents();
	}

	public Set<Schedule>    findScheduleByGroupId(int id)
	{
		Group group = groupRepo.findById(id);
		Set<Schedule> set = schoolRepo.findAllByGroup(group);
		return set;
	}


}

