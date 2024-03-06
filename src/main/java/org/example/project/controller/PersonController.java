package org.example.project.controller;

import org.example.project.model.Person;
import org.example.project.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public List<Person> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)

    public Person findById(@PathVariable(value = "id") String id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)

    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @RequestMapping(method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)

    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @RequestMapping(method = RequestMethod.DELETE,
            value = "/{id}")

    public void delete(@PathVariable(value = "id") String id) {
        service.delete(id);
    }
}
