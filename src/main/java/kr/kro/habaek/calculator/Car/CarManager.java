package kr.kro.habaek.calculator.Car;

import kr.kro.habaek.calculator.Car.Car;

public class CarManager {
    public static void main(String[] args) {
        Car dogCar = new Car();
        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}