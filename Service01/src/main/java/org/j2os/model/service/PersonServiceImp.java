package org.j2os.model.service;

import org.j2os.model.domain.Person;
import org.j2os.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImp implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
