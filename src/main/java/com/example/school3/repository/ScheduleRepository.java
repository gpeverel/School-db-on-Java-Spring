package com.example.school3.repository;

import com.example.school3.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>
{

	Set<Schedule> findAllByGroup(Group group);
	Set<Schedule> findAllByScheduleSubjectListContains(ScheduleSubject ss);
}