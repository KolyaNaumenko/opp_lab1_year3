package cars;

import java.util.Objects;

public abstract class Car {

    private String model;

    private int  price;

    private double fuelConsumption;
    private double pricebykm;

    private int maxSpeed;

    public Car(String model, int price, double fuelConsumption, int maxSpeed, double pricebykm) {
        if(Objects.equals(model, "")) {
            throw new IllegalArgumentException("Wrong data");
        }
        if(price <= 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        if(maxSpeed < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        if(fuelConsumption < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        if(pricebykm < 0) {
            throw new IllegalArgumentException("Wrong data");
        }

        this.model=model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }


    public abstract void getSpecialInfo();

    public int getPrice() {
        return this.price;
    }

    public String getModel() {
        return this.model;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }
    public double getPricebykm() {
        return this.pricebykm;
    }
}
