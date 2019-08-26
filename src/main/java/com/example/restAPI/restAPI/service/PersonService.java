package com.example.restAPI.restAPI.service;

import com.example.restAPI.restAPI.dao.PersonDao;
import com.example.restAPI.restAPI.model.Person;

public class PersonService {

    private  final PersonDao personDao;

    public PersonService(PersonDao personDao){

        this.personDao = personDao;
    }

    public int addPerson(Person person){

        return personDao.insertPerson(person);
    }
}
