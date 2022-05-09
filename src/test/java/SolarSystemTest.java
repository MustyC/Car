import com.sparta.mc.solar.Planet;
import com.sparta.mc.solar.SolarSystem;
import org.testng.annotations.Test;

public class SolarSystemTest {

  @Test
  void createPlanet() {
    Planet planet = new SolarSystem("", 34, 56 );
  }

}
