package com.example.school3.repository;

import com.example.school3.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface GroupRepository  extends JpaRepository<Group, Integer>
{
	Group findAllById(int number);
	Optional<Group> findByNumber(String number);
	boolean existsByNumber(String number);

	Group findById(int id);
}
