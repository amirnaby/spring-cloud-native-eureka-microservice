package org.j2os.model.service;

import org.j2os.model.domain.Car;
import org.j2os.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    @Transactional
    public Car save(Car car) {
        return carRepository.save(car);
    }
}