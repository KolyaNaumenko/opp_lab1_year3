package cars;

public class Minivan extends Car{

    private int passengers;

    public Minivan(String model, int  price, double fuelConsumption, int maxSpeed, int passengers,int pricebykm){

        super(model, price, fuelConsumption, maxSpeed,pricebykm);

        if((passengers <= 0)) {
            throw new IllegalArgumentException("Capacity rating must be positive");
        }

        this.passengers=passengers;
    }

    public int getCapacity() {
        return passengers;
    }

    @Override
    public void getSpecialInfo(){
        System.out.println("Capacity: "+ this.passengers);
    }
}
