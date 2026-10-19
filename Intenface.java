public class Intenface {
    public static void main(String[] args) {

        VehicleInterface Car = new InterfaceElectricCar();
        Car.start();
        Car.accelerate();
        Car.brake();

        VehicleInterface Car1 = new InterfaceFuelCar();
        Car1.start();
        Car1.accelerate();
        Car1.brake();
        
        
    }

    
}

interface VehicleInterface{
    void start();
    void accelerate();
    void brake();

}
class InterfaceFuelCar implements VehicleInterface{
     @Override

     public void start(){
        System.out.println("Fuel car is started");
    }

    @Override
    public void accelerate(){
    System.out.println("Fuelcar is asselerating at 10km/h");

    }
    @Override
     public void brake(){
         System.out.println("FuelCar is stopped");

    }




}
class InterfaceElectricCar implements VehicleInterface{
     @Override

    public void start(){
        System.out.println("Electric car is started");
    }
    @Override
     public void  accelerate(){
        System.out.println("Electriccar is asselerating at 10km/h");

    }
    @Override
     public void brake(){
         System.out.println("ElectricCar is stopped");

    }


}

