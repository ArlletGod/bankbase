package com.myex.bankbase.service.impl;

import com.myex.bankbase.domains.Person;
import com.myex.bankbase.repos.PersonRepo;
import com.myex.bankbase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
@Autowired
private PersonRepo personRepo;


    @Override
    public Person addPerson(Person person) {

        return personRepo.saveAndFlush(person);
    }



    @Override
    public Person editPerson(Person person) {
        return personRepo.saveAndFlush(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepo.findAll();
    }
}
