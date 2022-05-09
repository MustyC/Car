package com.sparta.mc.vehicles;

import java.math.BigDecimal;

public class Vehicle {
  private Colour colour;
  private int engineSize;
  private BigDecimal fuelLevel;
  private boolean motCheck;
  private boolean roadTaxStatus;

  public Vehicle( boolean roadTaxStatus, boolean motCheck, int engineSize, BigDecimal fuelLevel ) {
    this.roadTaxStatus = roadTaxStatus;
    this.motCheck = motCheck;
    this.engineSize = engineSize;
    this.fuelLevel = fuelLevel;
  }
}
