package com.APIRest.Client.Service;


import com.APIRest.Client.Repository.ClientRepository;
import com.APIRest.Client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;


@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public long ageCalculator(LocalDate c){
        Long result = ChronoUnit.YEARS.between(c, LocalDate.now());
        return result;
    }
    public Client create(Client newClient){
        Client c = new Client();
        c.setName(newClient.getName());
        c.setLastname(newClient.getLastname());
        c.setDateBirth(newClient.getDateBirth());
        return this.clientRepository.save(c);
    }
    public Client onclient(Long id){
        Optional<Client> c = this.clientRepository.findById(id);
        if (c.isPresent()) {
            Long a = ageCalculator(c.get().getDateBirth());
            c.get().setAge(a);
            return c.get();
        }else{
            return null;}
    }
}
