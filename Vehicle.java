public abstract class Vehicle {
    private String brand;
    private int kilometers;

    // constructors
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();
}
