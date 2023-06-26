package org.j2os.model.repository;

import org.j2os.model.domain.Car;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CarRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Car save(Car car)
    {
        entityManager.persist(car);
        return car;
    }
}
