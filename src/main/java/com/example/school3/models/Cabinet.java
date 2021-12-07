package com.example.school3.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
//@Data
//@RequiredArgsConstructor
@Entity
@Table(name = "cabinet")
public class Cabinet
{
	@Id
	@JsonIgnore
	@Column(name = "cabinet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;

	@Column(name = "floor")
	private int floor;

	@Column(name = "desks_number")
	private int couples;

//	@JsonBackReference
//	@OneToOne(mappedBy = "cabinet")
//	private Subject subject;
	@JsonBackReference
	@OneToMany(mappedBy = "cabinet")
	private Set<ScheduleSubject> scheduleSubjects;

}
