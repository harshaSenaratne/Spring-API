package com.example.restAPI.restAPI.dao;

import com.example.restAPI.restAPI.model.Person;

import java.util.UUID;

public interface PersonDao {
    //Add person when ID is given
    int insertPerson(UUID uuid, Person person);

    //randomly generates an ID when user has no ID
    default int insertPerson(Person person){
      UUID id = UUID.randomUUID();

      return insertPerson(id,person);
    }
}
