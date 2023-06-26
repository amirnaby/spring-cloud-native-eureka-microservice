package org.j2os.model.service;


import org.j2os.model.domain.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "person-service")
public interface PersonService {

    @GetMapping("/person/save")
    Person savePerson(@RequestParam("name") String name,
                      @RequestParam("family") String family);
}
