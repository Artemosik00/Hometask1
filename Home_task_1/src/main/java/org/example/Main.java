package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1, Сиваков Артем Владимирович, РИБО-05-22");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car brand");
        String carBrand = scan.next();
        Car car = new Car(carBrand);
        System.out.println("Name of brand before modification: "+ car.getCarBrand());
        CarService carService = new CarService();
        carService.modify(car);
        System.out.println("Name of brand after modification: "+car.getCarBrand());

    }
}
