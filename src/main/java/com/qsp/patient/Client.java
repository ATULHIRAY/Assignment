package com.qsp.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
	@Id
    private String clientId;
    private String name;
    private String email;

    // Getters and Setters
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public Client() {
		super();
	}
}
