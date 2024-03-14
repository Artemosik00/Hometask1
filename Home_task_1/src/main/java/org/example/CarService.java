package org.example;

public class CarService {

    public void modify(Car car){
        car.setCarBrand(car.getCarBrand().replaceAll("a", "o"));
        car.setCarBrand(car.getCarBrand().replaceAll("i", "e"));
        car.setCarBrand(car.getCarBrand().toLowerCase());
    }
}
