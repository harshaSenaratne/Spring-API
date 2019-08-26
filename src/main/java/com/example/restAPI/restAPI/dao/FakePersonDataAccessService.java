package com.example.restAPI.restAPI.dao;

import com.example.restAPI.restAPI.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao {
    private  static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID uuid, Person person) {
        DB.add(new Person(uuid,person.getName()));

        return 1;
    }
}

