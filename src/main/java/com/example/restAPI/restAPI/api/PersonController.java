package com.example.restAPI.restAPI.api;

import com.example.restAPI.restAPI.model.Person;
import com.example.restAPI.restAPI.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
