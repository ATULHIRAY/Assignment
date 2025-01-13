package com.qsp.patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClientDAO {
	
	@Autowired
	ClientRepo repo;
	public Client saveClient (Client Client) {
		return repo.save(Client);
	}
	public Client updateClient(Client Client) {
		return repo.save(Client);
		
	}
	public Client findClientById(int id) {
		Optional<Client> optional = repo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}
//	public List<Client> findByClientName(String name){
//		return findAllClient();
//	}
	public Client deleteClientById(int id) {
		repo.deleteById(id);
		return null;
		
	}
	public List<Client> findAllClient(){
		return repo.findAll();
	}
}
