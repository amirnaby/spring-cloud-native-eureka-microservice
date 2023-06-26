package org.j2os.controller;

import org.j2os.model.domain.Person;
import org.j2os.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/save")
    public ResponseEntity<Person> savePerson(@RequestParam("name") String name,
                                             @RequestParam("family") String family) {
        try {
            Person person1 = new Person().builder().name(name).family(family).build();
            Person savedPerson = personService.save(person1);
            if (savedPerson.getPersonId() == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(savedPerson, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
