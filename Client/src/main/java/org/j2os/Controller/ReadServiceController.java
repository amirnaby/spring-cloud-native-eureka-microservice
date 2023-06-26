package org.j2os.Controller;

import org.j2os.model.domain.Car;
import org.j2os.model.domain.Person;
import org.j2os.model.domain.PersonDto;
import org.j2os.model.service.CarService;
import org.j2os.model.service.PersonService;
import org.j2os.model.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadServiceController {
    @Autowired
    PersonService personService;
    @Autowired
    FindService findService;
    @Autowired
    CarService carService;


    @GetMapping("/savePerson")
    public ResponseEntity<Object> savePerson(@RequestParam("name") String name,
                                             @RequestParam("family") String family){
        Person person =  personService.savePerson(name,family);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/saveCar")
    public ResponseEntity<Car> saveCar(@RequestParam("carModel") String carModel,
                                       @RequestParam("personId") String personId){
        Car car = carService.saveCar(carModel, personId);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/findPerson")
    public ResponseEntity<PersonDto> findPerson(@RequestParam("personId") String personId){
        PersonDto person = findService.findPerson(personId);
        person.getCars().forEach(c->c.setPersonId(Long.valueOf(personId)));
        return ResponseEntity.ok(person);
    }
}
