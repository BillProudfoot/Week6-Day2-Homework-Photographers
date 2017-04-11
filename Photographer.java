import java.util.*;

public class Photographer{

  private String name;

  private ArrayList<Collection> bag;

  public Photographer(String name){
    this.name = name;
    this.bag = new ArrayList<Collection>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return bag.size();
  }

  public void add(Collection collection){
    bag.add(collection);
  }

  public Collection removeCamera(){
    if(cameraCount() > 0 ) {
      return bag.remove(0);
    }

    return null;
  }
}