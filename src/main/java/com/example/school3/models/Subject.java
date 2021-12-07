package com.example.school3.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
//@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "subject")
public class Subject
{
	@Id
	//@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id")
	private int id;

	@Column(name = "title", unique = true, nullable = false, length = 30)
	private String title;

//	@Column(name = "number_of_years", nullable = false)
//	private int NumberOfYears;

//	@JsonManagedReference
//	@OneToOne(mappedBy = "subject", cascade = CascadeType.ALL)
//	private Set<Teacher> teachers;

//	@JsonBackReference
//	@ManyToOne
//	@JoinColumn(name = "schedule_id")
//	private Schedule schedule;

	//@JsonManagedReference
//	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
//	private Set<Schedule> schedules;




//	@JsonManagedReference
//	@OneToOne
//	@JoinColumn(name = "cabinet_id")
//	private Cabinet cabinet;

//	@JsonBackReference
//	@OneToOne
//	@JoinColumn(name = "subject_id")
//	private Teacher teacher;


	@JsonBackReference
	@OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
	private Set<ScheduleSubject>    scheduleSubjects;

//	@OneToOne(mappedBy = "subject")
//	private ScheduleSubject scheduleSubject;


}
