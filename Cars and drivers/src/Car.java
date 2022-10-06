public class Car {
  private String make;
  private String model;
  private int year;
  private String bodystyle;
  private Driver driver;

  public Car(String make, String model, int year, String bodystyle) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.bodystyle = bodystyle;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }


  public String toString() {
    return "make:" + this.make+ "model:" + this.model + "year:" + this.year + "bodystyle:" + this.bodystyle;
  }
}
