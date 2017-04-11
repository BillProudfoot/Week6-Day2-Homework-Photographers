import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;
  Digital digital;
  Analogue analogue;

  @Before 
  public void before() {
    photographer = new Photographer("Lichfield");
    camera = new Camera("Sony ILCE5100L", "No noise reduction", "Lo-res");
    digital = new Digital("Nikon", "2", "3");
    analogue = new Analogue("Polariod", "black and white", "Flash");
  }

  @Test
  public void hasName(){
    assertEquals("Lichfield", photographer.getName());
  }
 
 @Test
 public void addCamera(){
  photographer.add(camera);
  assertEquals(1,photographer.cameraCount());
 }

 @Test 
 public void removeCamera(){
  photographer.add(camera);
  Printable space = photographer.removeCamera();
  assertEquals(0,photographer.cameraCount());
 }

 @Test
 public void printAllDetails() {
  photographer.add(camera);
  photographer.add(digital);
  String alldetails = photographer.printAllDetails();

  assertEquals("Sony ILCE5100L No noise reduction Lo-res Nikon 2 3 ", alldetails);
 }

 // @Test
 // public void printAllDetails() {
 //  photographer.add(camera);
 //  photographer.add(analogue);
 //  String alldetails = photographer.printAllDetails();

 //  assertEquals("camera Polariod black and white Flash ", alldetails); 
 //  }

 }

