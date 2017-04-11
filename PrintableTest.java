import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PrintableTest{
  Photographer photographer;
  Camera camera;
  Digital digital;
  Analogue analogue;

  @Before 
  public void before() {
    photographer = new Photographer("Lichfield");
    camera = new Camera("Sony ILCE5100L", "No noise reduction", "Lo-res");
    digital = new Digital("Nikon", "Hi-res", "Noise Reduction filter");
    analogue = new Analogue("Polariod", "black and white", "Flash");
  }

  @Test
  public void printAllDetails() {
   photographer.add(camera);
   photographer.add(digital);
   photographer.add(analogue);
   String alldetails = photographer.printAllDetails();

   assertEquals("Sony ILCE5100L No noise reduction Lo-res Nikon Hi-res Noise Reduction filter Polariod black and white Flash ", alldetails);
  }

}