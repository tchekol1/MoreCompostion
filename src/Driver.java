public class Driver extends Person {
    private String licenceType;

    public Driver(String name, int id, String licenceType) {
        super(name, id);
        this.licenceType = licenceType;
    }

    public Driver(String licenceType) {
        this.licenceType = licenceType;
    }

    public Driver(Person person, String licenceType) {
        super(person);
        this.licenceType = licenceType;
    }

    @Override
    public String toString() {
        return  super.toString()+ " "+ licenceType;
    }
}
