package com.example.school3.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
//@Data
//@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teacher")
public class Teacher
{
	@Id
//	@JsonIgnore
	@Column(name = "teacher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@Column(name = "date_of_birth", nullable = false)
//	private LocalDate dateOfBirth;

	@Column(name = "full_name", nullable = false)
	private String fullName;

//	@JsonBackReference
//	@ManyToOne
//	@JoinColumn(name = "subject_id", nullable = false)
//	private Subject subject;

//	@JsonManagedReference
//	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
//	private Set<Schedule> schedule;


//	@JsonManagedReference
//	@OneToOne(mappedBy = "teacher")
//	private Subject subject;

	@JsonBackReference
	@OneToMany(mappedBy = "teacher")
	private Set<ScheduleSubject> scheduleSubject;

}
