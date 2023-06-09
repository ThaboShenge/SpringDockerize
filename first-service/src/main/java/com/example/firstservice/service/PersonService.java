package com.example.firstservice.service;

import com.example.firstservice.models.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person getPersonById(Long id);

    void addPerson(Person person);

    void updatePerson(Long id, Person person);

    void deletePerson(Long id);
}
