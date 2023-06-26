package org.j2os.model.domain;

public class Car {
    private Long carId;
    private String carModel;
    private Long personId;

    public Car() {
    }

    public Car(Long carId, String carModel, Long personId) {
        this.carId = carId;
        this.carModel = carModel;
        this.personId = personId;
    }

    public Car(String carModel, Long personId) {
        this.carModel = carModel;
        this.personId = personId;
    }

    public Long getCarId() {
        return carId;
    }

    public Car setCarId(Long carId) {
        this.carId = carId;
        return this;
    }

    public String getCarModel() {
        return carModel;
    }

    public Car setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public Long getPersonId() {
        return personId;
    }

    public Car setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
}
