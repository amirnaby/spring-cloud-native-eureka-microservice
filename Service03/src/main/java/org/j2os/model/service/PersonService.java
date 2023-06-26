package org.j2os.model.service;

import org.j2os.model.domain.Person;
import org.j2os.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person findPersonById(Long personId) {
        return personRepository.findByPersonId(personId);
    }
}