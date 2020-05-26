package com.myex.bankbase.service;

import com.myex.bankbase.domains.Person;

import java.util.List;

public interface PersonService {
    Person addPerson (Person person);
    Person editPerson(Person person);
    List<Person> getAll();

}
