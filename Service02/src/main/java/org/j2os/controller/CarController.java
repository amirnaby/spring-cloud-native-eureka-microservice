package org.j2os.controller;

import org.j2os.model.domain.Car;
import org.j2os.model.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/save")
    public ResponseEntity<Car> saveCar(@RequestParam("carModel") String carModel,
                                       @RequestParam("personId") String personId) {
        try {
            Car car1 = new Car().builder().carModel(carModel).personId(Long.valueOf(personId)).build();
            Car savedCar = carService.save(car1);
            if (savedCar.getCarId() == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(savedCar, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
