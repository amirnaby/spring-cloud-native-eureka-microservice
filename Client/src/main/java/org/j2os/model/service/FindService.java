package org.j2os.model.service;


import org.j2os.model.domain.PersonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "find-service")
public interface FindService {

    @GetMapping("/person/find")
    PersonDto findPerson(@RequestParam("personId") String personId);

}
