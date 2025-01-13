package com.qsp.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientDAO dao;

    @PostMapping("/cl")
    public Client saveClient(@RequestBody Client client) {
        return dao.saveClient(client);
    }

    @PutMapping("/cl")
    public Client updateClient(@RequestBody Client client) {
        return dao.updateClient(client);
    }

    @GetMapping("/cl/{id}")
    public Client findClientById(@PathVariable Integer id) {
        return dao.findClientById(id);
    }

    @DeleteMapping("/cl/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        Client client = dao.findClientById(id);
        if (client != null) {
            dao.deleteClientById(id);
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Given ID is not present");
        }
    }

    @GetMapping("/cl")
    public List<Client> findAll() {
        return dao.findAllClient();
    }
}
