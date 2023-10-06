package com.example.restwithspringbootandjavaerudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.restwithspringbootandjavaerudio.model.Person;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());


    public List<Person> findAll(){
        logger.info("FIND ALL PEOPLE");

        List<Person> persons = new ArrayList<>();
        for(int i =0; i<8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;

        



    }


   


    public Person findByid(String id){

        logger.info("FINDING ONE PERSON");

        Person person =  new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Pedro");
        person.setLastName("Henrique");
        person.setAddress("Serra Caiada");
        person.setGender("Male");
        return person;
    }


     private Person mockPerson(int i) {
        Person person =  new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name "+i);
        person.setLastName("Person last name "+i);
        person.setAddress("Some address " +i);
        person.setGender("Male");
        return person;
    }
    
}
