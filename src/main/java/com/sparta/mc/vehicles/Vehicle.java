package com.sparta.mc.vehicles;

import java.math.BigDecimal;

public class Vehicle {
  private Colour colour;
  private double engineSize;
  private double fuelLevel;
  private boolean motCheck;
  private boolean roadTaxStatus;

  public Vehicle( boolean roadTaxStatus, boolean motCheck, double engineSize, double fuelLevel ) {
    this.roadTaxStatus = roadTaxStatus;
    this.motCheck = motCheck;
    this.engineSize = engineSize;
    this.fuelLevel = fuelLevel;
  }

  public Colour getColour() {
    return colour;
  }

  public double getEngineSize() {
    return engineSize;
  }

  public double getFuelLevel() {
    return fuelLevel;
  }

  public boolean isMotCheck() {
    return motCheck;
  }

  public boolean isRoadTaxStatus() {
    return roadTaxStatus;
  }
}
