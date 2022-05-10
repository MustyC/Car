package com.sparta.mc.vehicles;

import com.sparta.mc.vehicles.interfaces.Convertible;
import com.sparta.mc.vehicles.interfaces.Spoiler;

public class Car extends Vehicle implements Convertible {
  private String carModel;
  private String carMake;

  public Car( String carModel, String carMake, boolean roadTaxStatus, boolean motCheck, double engineSize, double fuelLevel ) {
    super( roadTaxStatus, motCheck, engineSize, fuelLevel );
    this.carModel = carModel;
    this.carMake = carMake;
  }


  public String listCarDetails() {
    return "This car is a " + Colour.RED + " " + carMake + " " + carModel + ". " +
            "It does have road tax, it has not had its MOT checked. " +
            "The engine can hold " + getEngineSize() + " L of fuel. It currently has "
            + getFuelLevel() + " L of fuel left.";
  }

  public String listCar2Details() {
    return "This car is a " + Colour.BLACK + " " + carMake + " " + carModel + ". " +
            "Its road tax status is " + isRoadTaxStatus() + ", its MOT check is " + isMotCheck()+
            ". The engine can hold " + getEngineSize() + " L of fuel. It currently has "
            + getFuelLevel() + " L of fuel left.";
  }

}
