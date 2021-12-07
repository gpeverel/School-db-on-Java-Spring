package com.example.school3.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "schedule")
public class Schedule
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schedule_id")
	//@JsonIgnore
	private int id;

	@Column(name = "day_of_week")
	private String dayOfWeek;

//	@JsonManagedReference
//	@OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
//	private Set<Subject> subjects;

	//@JsonBackReference
//	@ManyToOne
//	@JoinColumn(name = "subject_id")
//	private Subject subject;

//	@JsonIgnore
//	@ManyToOne
//	@JoinColumn(name = "teacher_id")
//	private Teacher teacher;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "group_id")
	private Group group;

	@JsonManagedReference
	@OneToMany(mappedBy = "schedule")
	private List<ScheduleSubject> scheduleSubjectList;
}
