package com.example.school3.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;

//	@Column(name = "date_of_birth", nullable = false)
//	private LocalDate dateOfBirth;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@JsonBackReference
	@ManyToOne
	//@JsonIgnore
	@JoinColumn(name = "group_id")
	private Group group;

//	@Column(name = "number")
//	private String groupNumber;
}
