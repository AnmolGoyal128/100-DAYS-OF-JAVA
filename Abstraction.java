public class Abstraction {
    public static void main(String[] args) {
        // AbstractCar c = new AbstractCar() {};  //not fessible due to abstract class
        AbstractCar c1 = new AbstractElectricCar();
        c1.start();
        c1.accelerate();
        c1.brake();

        AbstractCar c2 = new AbstractFuelCar();
        c2.start();
        c2.accelerate();
        c2.brake();

                
        
    }
}

abstract class AbstractCar{
    void start(){
        System.out.println("Car Started");
    }
    abstract void accelerate();
        // System.out.println("car is asselerating at 10km/h");
    
    abstract void brake();
        // System.out.println("Car is stopped");
}



    

class AbstractFuelCar extends AbstractCar{

    @Override
   void accelerate(){
    System.out.println("Fuelcar is asselerating at 10km/h");

    }
    @Override
    void brake(){
         System.out.println("FuelCar is stopped");

    }




}
class AbstractElectricCar extends AbstractCar{
    @Override
    void  accelerate(){
        System.out.println("Electriccar is asselerating at 10km/h");

    }
    @Override
    void brake(){
         System.out.println("ElectricCar is stopped");

    }


}
