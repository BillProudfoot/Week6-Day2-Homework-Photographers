public class Analogue implements Printable {

  private String brand;
  private String feature1;
  private String feature2;

  public Analogue(String brand, String feature1, String feature2 ) {
    this.brand = brand;
    this.feature1 = feature1;
    this.feature2 = feature2;
  }



  public String printDetails() {
    return brand + " " + feature1 + " " + feature2;
  }
}