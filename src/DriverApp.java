public class DriverApp {
    public static void main(String[] args) {
        Driver driver= new Driver("Tmc",123,"Commercial");
        Car car = new Car("Camry","Toyota",2013,driver);
        car.setColor("silver");
        //System.out.println(car.toString());
        System.out.println("The "+ car.getColor()+ " car is being driven by "+ car.getDriver().getName());

    }
}

