package com.APIRest.Client.Service;


import com.APIRest.Client.Repository.ClientRepository;
import com.APIRest.Client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;



@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    /*public long ageCalculator(){
        LocalDate hoy = LocalDate.now();
        Long result = ChronoUnit.YEARS.between(, hoy);
        return result;
    }*/

    public Client create(Client newClient){
        return this.clientRepository.save(newClient);
    }
    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }



}
