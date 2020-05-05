public class Car {
    private String model;
    private Driver driver;
    private String make;
    private int yearOfMake;
    private String color;

    public Car() {
    }

    public Car(String model, String make, int yearOfMake, Driver driver) {
        this.model = model;
        this.make = make;
        this.yearOfMake = yearOfMake;
        this.driver=driver;
    }

    public Car(String make, String color) {
        this.make = make;
        this.color = color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
    public String start(){
        return "starting";
    }
    public  String stop(){
        return "stopped";
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", driver name=" + driver.getName() +" Driver Id "+ driver.getId()+" "+
                ", make='" + make + '\'' +
                ", yearOfMake=" + yearOfMake +
                ", color='" + color + '\'' ;
    }
}
