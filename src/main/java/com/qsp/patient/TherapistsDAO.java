package com.qsp.patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TherapistsDAO {
	@Autowired
	TherapistsRepo repo;
	public Therapists saveTherapists (Therapists Therapists) {
		return repo.save(Therapists);
	}
	public Therapists updateTherapists(Therapists Therapists) {
		return repo.save(Therapists);
		
	}
	public Therapists findTherapistsById(int id) {
		Optional<Therapists> optional = repo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}
//	public List<Therapists> findByTherapistsName(String name){
//		return findAllTherapists();
//	}
	public Therapists deleteTherapistsById(int id) {
		repo.deleteById(id);
		return null;
		
	}
	public List<Therapists> findAllTherapists(){
		return repo.findAll();
	}
}
