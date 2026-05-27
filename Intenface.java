public class Intenface {
    public static void main(String[] args) {

        car Car = new ElectricCar();
        Car.start();
        Car.accelerate();
        Car.brake();

        car Car1 = new FuelCar();
        Car1.start();
        Car1.accelerate();
        Car1.brake();
        
        
    }

    
}

interface car{
    void start();
    void accelerate();
    void brake();

}
class FuelCar implements car{
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
class ElectricCar implements car{
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

