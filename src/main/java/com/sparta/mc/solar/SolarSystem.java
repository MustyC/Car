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
