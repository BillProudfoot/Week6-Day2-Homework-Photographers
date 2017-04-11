import static org.junit.Assert.assertEquals;
import org.junit.*;

public class AnalogueTest{
  Photographer photographer;
  Camera camera;
  Digital digital;
  Analogue analogue;

  @Before 
  public void before() {
    photographer = new Photographer("Lichfield");
    camera = new Camera();
    digital = new Digital("Nikon", "2", "3");
    analogue = new Analogue("Polariod", "black and white", "Flash");
  }

 @Test
 public void printAllDetails() {
  photographer.add(camera);
  photographer.add(analogue);
  String alldetails = photographer.printAllDetails();

  assertEquals("camera Polariod black and white Flash ", alldetails); 
  }

 }

