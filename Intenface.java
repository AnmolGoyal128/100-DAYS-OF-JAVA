public class Intenface {
    public static void main(String[] args) {

<<<<<<< HEAD
        VehicleInterface Car = new InterfaceElectricCar();
=======
        car Car = new ElectricCar();
>>>>>>> origin/main
        Car.start();
        Car.accelerate();
        Car.brake();

<<<<<<< HEAD
        VehicleInterface Car1 = new InterfaceFuelCar();
=======
        car Car1 = new FuelCar();
>>>>>>> origin/main
        Car1.start();
        Car1.accelerate();
        Car1.brake();
        
        
    }

    
}

<<<<<<< HEAD
interface VehicleInterface{
=======
interface car{
>>>>>>> origin/main
    void start();
    void accelerate();
    void brake();

}
<<<<<<< HEAD
class InterfaceFuelCar implements VehicleInterface{
=======
class FuelCar implements car{
>>>>>>> origin/main
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
<<<<<<< HEAD
class InterfaceElectricCar implements VehicleInterface{
=======
class ElectricCar implements car{
>>>>>>> origin/main
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

