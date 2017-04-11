public class Digital implements Printable{

  private String name;
  private String feature1;
  private String feature2;

  public Digital(String name, String feature1, String feature2) {
    this.name = name;
    this.feature2 = feature2;
    this.feature1 = feature1;
  }

  public String printDetails() {
    return name + " " + feature1 + " " + feature2;
  }
}