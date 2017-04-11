import java.util.*;

public class Photographer{
  private String name;
  private ArrayList<Printable> bag;

  public Photographer(String name){
    this.name = name;
    this.bag = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return bag.size();
  }

  public void add(Printable printable){
    bag.add(printable);
  }

  public Printable removeCamera(){
    if(cameraCount() > 0 ) {
      return bag.remove(0);
    }

    return null;
  }

  public String printAllDetails() {
    String details = "";
    for(Printable printable : bag) {
      details += printable.printDetails() + " ";
    }

    return details;
  }
}