package com.example.school3.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "schedule_subject")
public class ScheduleSubject
{
	@Id
	//@JsonIgnore
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "schedule_id")
	private Schedule schedule;

	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "cabinet_id")
	private Cabinet cabinet;

	@Column(name="time")
	private LocalTime time;

	@Column(name = "day")
	private String day;

	@PrePersist
	private void init()
	{
		System.out.println(schedule.getDayOfWeek());
		day = schedule.getDayOfWeek();
	}

}
