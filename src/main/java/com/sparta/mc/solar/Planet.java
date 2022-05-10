package com.sparta.mc.solar;

public enum Planet {
  MERCURY( 3.303e+23, 2.4397e6, 35_000_000 ),
  VENUS( 4.869e+24, 6.0518e6, 67000000 ),
  EARTH( 5.576e+24, 6.37814e6, 93000000 ),
  MARS( 6.421e+23, 3.3972e6, 142000000 ),
  JUPITER( 1.9e+27, 7.1492e7, 484000000 ),
  SATURN( 5.688e+26, 6.0268e7, 889000000 ),
  URANUS( 8.686e+25, 2.5559e7, 1790000000 ),
  NEPTUNE( 1.024e+26, 2.4746e7, 2.8800e5 );

  private final double mass;   // in kilograms
  private final double radius; // in meters
  private final double distance; // in miles

  Planet( double mass, double radius, double distance ) {
    this.mass = mass;
    this.radius = radius;
    this.distance = distance;
  }
}

