package com.example.school3.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Getter
@Setter
//@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "group1")
public class Group
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "group_id")
	private int id;

	@Column(name = "number", unique = true, nullable = false, length = 10)// обязательное, незануляемое поле, размер 10
	private String  number;

	@Column(name = "students_count", nullable = false)
	private int numberOfStudents;

	//@JsonManagedReference
	//@ToString.Exclude
	@OneToMany(mappedBy = "group"/*, cascade = CascadeType.ALL, fetch = FetchType.EAGER*/)
	private Set<Student> students;

	//@JsonManagedReference
	//@ToString.Exclude
	@OneToMany(mappedBy = "group"/*, cascade = CascadeType.ALL, fetch = FetchType.EAGER*/)
	private Set<Schedule> schedules;

}
