import com.sparta.mc.solar.Planet;
import com.sparta.mc.solar.SolarSystem;
import org.junit.jupiter.api.Test;

public class SolarSystemTest {

  @Test
  void createPlanet() {
    SolarSystem planet = new SolarSystem(Planet.EARTH, 34, 56 );
  }

}
