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
    camera = new Camera();
    digital = new Digital();
    analogue = new Analogue();
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
  Collection space = photographer.removeCamera();
  assertEquals(0,photographer.cameraCount());
 }

}