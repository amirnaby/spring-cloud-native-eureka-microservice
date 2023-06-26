package org.j2os.model.repository;

import org.j2os.model.domain.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public Person save(Person person)
    {
        entityManager.persist(person);
        return person;
    }
}