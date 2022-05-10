import com.sparta.mc.vehicles.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
  @Test
  void createCar() {
    Car car = new Car( "Aventador",
            "Lamborghini", true, false,
            85.00, 42.73 );
    String result = car.listCarDetails();
    Assertions.assertEquals( "This car is a RED Lamborghini Aventador. " +
            "It does have road tax, it has not had its MOT checked. " +
            "The engine can hold 85.0 L of fuel. " +
            "It currently has 42.73 L of fuel left.", result );
  }

  @Test
  void createCar2() {
    Car car = new Car( "S Class",
            "Mercedes", true, true,
            80.00, 63.97 );
    String result = car.listCar2Details();
    Assertions.assertEquals( "This car is a BLACK Mercedes S Class. " +
            "Its road tax status is true, its MOT check is true. " +
            "The engine can hold 80.0 L of fuel. " +
            "It currently has 63.97 L of fuel left.", result );
  }

}

