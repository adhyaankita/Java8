package com.instanceOf;

class Vehicle{}
class Car extends Vehicle{}
class Train extends Vehicle{}
interface Wheeler{}
public class Main {

    public static void main(String[] args) {
    //Car firstCar = new Car(); will not allow the statement of instanceof Train
	Vehicle firstCar = new Car(); //if Vehicle ref isn't use, you'll get compile error for Train
	System.out.println(firstCar instanceof Car);
	System.out.println(firstCar instanceof Vehicle);
	System.out.println(firstCar instanceof Train);
	System.out.println(firstCar instanceof Object);
	firstCar = null;
	System.out.println(firstCar instanceof Object);
	System.out.println(firstCar instanceof Wheeler);//compiler allows this because later the class may implement Wheeler
    }
}
