package org.j2os.model.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDto implements Serializable {
    private Long personId;
    private String name;
    private String family;
    private List<Car> cars;
    public PersonDto() {
    }

    public PersonDto(Long personId, String name, String family, List<Car> cars) {
        this.personId = personId;
        this.name = name;
        this.family = family;
        this.cars = cars;
    }

    public PersonDto(String name, String family, List<Car> cars) {
        this.name = name;
        this.family = family;
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Long getPersonId() {
        return personId;
    }

    public PersonDto setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
