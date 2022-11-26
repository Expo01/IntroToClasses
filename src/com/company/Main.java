package com.company;

public class Main {

    public static void main(String[] args) {
	    Car firstCar = new Car();
        firstCar.setColor("white");
        firstCar.setDoors(4);
        firstCar.setMake("tesla");
        firstCar.setHybridOrElectric(true);
        firstCar.describeCar();

        Car secondCar = new Car();
//        secondCar.setColor("black");  this will throw the null exception since color field never initialized
        secondCar.setMake("forerunner");
        secondCar.setDoors(4);
        // hybrid left out, but default of primitive type boolean has default value of false
        secondCar.describeCar();

       secondCar.setColor("rainbow");
        secondCar.setDoors(7);
        secondCar.setMake("clown car");
        secondCar.describeCar();
        //field for secondCar object reassigned.


    }
}
