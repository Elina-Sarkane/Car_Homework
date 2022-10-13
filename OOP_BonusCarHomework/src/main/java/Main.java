/*
Implement a class Car with the following properties.
A car has a certain fuel efficiency (measured in km/litre) and a certain amount of fuel in the fuel tank.
The efficiency is specified in the constructor, and the initial fuel level is 0.
Supply a method drive that simulates driving the car for a certain distance, reducing the fuel level in the tank,
and methods getFuelLevel, to return the current fuel level, and addFuel, to tank up. Sample usage:
Car myHybrid = new Car(30); // 30 km per litre
myHybrid.addFuel(20); // Tank 20 litres
myHybrid.drive(100); // Drive 100 km
System.out.println(myHybrid.getFuelLevel()); //Print fuel remaining
*/

public class Main {
    public static void main(String[] args) {
        //this means that 1 liter per 30km
        Car myHybrid = new Car(30);
        //this should show 0
        System.out.println("Fuel level at the start - " + myHybrid.getFuelLevel() + " liters");
        myHybrid.addFuel(20);
        //now should be 20 liter
        System.out.println("Fuel level after getting fuel - " + myHybrid.getFuelLevel() + " liters");
        myHybrid.drive(100);
        //this should show left fuel. This means 1/3 = 0,333333333, which means that 10km = 0,3333333333liter. So 20-3,333333333 = 16,666666666666667
        System.out.println(myHybrid.getFuelLevel() + " liters left in the tank");


        Car car1 = new Car();
        car1.setFuelEfficiency(30);
        car1.setFuelLevel(0);
        System.out.println("\nRight now we have fuel - " + car1.getFuelLevel() + " liters");
        car1.addFuel(20);
        System.out.println("Fuel level after getting fuel - " + car1.getFuelLevel() + " liters");
        //to get 0 in the fuel tank it means that 30km * 20liters = 600km/liter
        car1.drive(600);
        System.out.println(car1.getFuelLevel() + " liters left in the tank");
    }
}
