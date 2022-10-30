package com.APIRest.Client.controller;


import com.APIRest.Client.Service.ClientService;
import com.APIRest.Client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api/client")
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public ResponseEntity<Client> create(@RequestBody Client client){
        return new ResponseEntity<>(this.clientService.create(client), HttpStatus.OK );
    }


    @GetMapping("/{id}")
    public ResponseEntity<Client> onclient(@PathVariable Long id){
        return new ResponseEntity<>(this.clientService.onclient(id), HttpStatus.OK);
    }



}
