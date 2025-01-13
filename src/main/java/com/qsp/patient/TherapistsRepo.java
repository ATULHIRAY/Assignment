package com.qsp.patient;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TherapistsRepo extends JpaRepository<Therapists, Integer> {
	List<Therapists> findByName(String name);
}
