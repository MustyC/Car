package com.sparta.mc.vehicles;

import java.math.BigDecimal;

public class Car extends Vehicle {
  //  model, make, engine size, colour, style,
//  road tax status,  fuel level, mot checked, etc.
//  Put in the instance variables, and add some methods
  private String carModel;
  private String carMake;

  public Car( String carModel, String carMake, boolean roadTaxStatus, boolean motCheck, int engineSize, BigDecimal fuelLevel ) {
    super( roadTaxStatus, motCheck, engineSize, fuelLevel );
    this.carModel = carModel;
    this.carMake = carMake;
  }
}
