package com.APIRest.Client.model;



import javax.persistence.*;
import java.time.LocalDate;
import lombok.Data;


@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private LocalDate dateBirth;

    @Transient
    private Long age;




}
