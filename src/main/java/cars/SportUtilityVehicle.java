package cars;

public class SportUtilityVehicle extends Car{

    private int passability;

    public SportUtilityVehicle(String model, int  price, double fuelConsumption, int maxSpeed, int passability, int pricebykm){

        super(model, price, fuelConsumption, maxSpeed,pricebykm);

        if((passability <= 0) || (passability>10)) {
            throw new IllegalArgumentException("Passability rating must be in the range from 1 to 10");
        }

        this.passability = passability;
    }

    public int getPassability() {
        return passability;
    }

    @Override
    public void getSpecialInfo(){
        System.out.println("Passability: "+ this.passability);
    }
}
