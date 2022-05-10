package com.sparta.mc.solar;

public class SolarSystem {
  private final Planet planet;
  private double distance;
  private double mass;

  public SolarSystem( Planet planet, double distance, double mass ) {
    this.planet = planet;
    this.distance = distance;
    this.mass = mass;
  }



}


//    Enums
//We have 8 planets in the solar system. All of these have different
// characteristics, including name, distance away from the sun, mass, etc.

//Create an enum, Planet, with 8/9 values representing the planets in the solar system.
//Each value should include the name of the planet, average distance from sun & mass.
//Write some test code (first smile) to demonstrate the use of the enum.
// Demonstrate the use of == and .equals to compare values.


//    Abstraction
//Create a new package called vehicles. Create a Java Class that represents a car.
//It should contain information about model, make, engine size, colour, style,
//road tax status, fuel level, mot checked, etc. Put in the instance variables,
//and add some methods. Add in a program that uses this car class.


//    Encapsulation
//Apply the encapsulation principle to the vehicle class you created earlier,
//by applying access modifiers and creating getters and setters, and creating
//some constructors. Fix the code that uses these variables and methods.


//    Inheritance
//Create an inheritance hierarchy in your vehicle system.
//You will already have a car class. Add in an inheritance relationship to things
//like vehicle, bus, etc. Also, create objects of each one of your classes.


//  Interfaces
//Have a think about what interfaces you could define for a vehicle.


