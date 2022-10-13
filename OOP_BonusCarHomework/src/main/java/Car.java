public class Car {
    private double fuelEfficiency; //measured in km/liter
    private double fuelLevel; //fuel level in tank
    private final double INITIAL_FUEL_LEVEL = 0;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
       this.fuelLevel = INITIAL_FUEL_LEVEL;
    }
    public Car(){}

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void addFuel(double addFuel){
        fuelLevel += addFuel;
    }

    public void drive(double drive){
        //drive = fuelEfficiency + drive;
        fuelLevel = fuelLevel - (drive / fuelEfficiency);
    }
}
