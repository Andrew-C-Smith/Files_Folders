package com.example.Files_and_Folders.Controllers;

import com.example.Files_and_Folders.Models.Person;
import com.example.Files_and_Folders.Repositories.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PersonsController {

    @Autowired
    PersonsRepository personsRepository;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personsRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personsRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
