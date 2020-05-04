package singleton.calculator;

public class Client {
    private String name;
    private double weight, height;
    private MeasurementSystem measurementSystem;

    public Client(String name, double weight, double height, MeasurementSystem measurementSystem) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.measurementSystem = measurementSystem;
    }

    public double getHeight() {
        return height;
    }

    public MeasurementSystem getMeasurementSystem() {
        return measurementSystem;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
