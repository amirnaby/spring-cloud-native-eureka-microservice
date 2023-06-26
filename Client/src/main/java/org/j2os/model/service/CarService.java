package org.j2os.model.service;


import org.j2os.model.domain.Car;
import org.j2os.model.domain.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "car-service")
public interface CarService {

    @GetMapping("/car/save")
    Car saveCar(@RequestParam("carModel") String carModel,
                @RequestParam("personId") String personId);
}
