public class Abstraction {
    public static void main(String[] args) {
<<<<<<< HEAD
        // AbstractCar c = new AbstractCar() {};  //not fessible due to abstract class
        AbstractCar c1 = new AbstractElectricCar();
=======
        // car c = new car() {};  //not fessible due to abstract class od car
        car c1 = new ElectricCar();
>>>>>>> origin/main
        c1.start();
        c1.accelerate();
        c1.brake();

<<<<<<< HEAD
        AbstractCar c2 = new AbstractFuelCar();
=======
        car c2 = new FuelCar();
>>>>>>> origin/main
        c2.start();
        c2.accelerate();
        c2.brake();

                
        
    }
}

<<<<<<< HEAD
abstract class AbstractCar{
=======
abstract class car{
>>>>>>> origin/main
    void start(){
        System.out.println("Car Started");
    }
    abstract void accelerate();
        // System.out.println("car is asselerating at 10km/h");
    
    abstract void brake();
        // System.out.println("Car is stopped");
}



    

<<<<<<< HEAD
class AbstractFuelCar extends AbstractCar{
=======
class FuelCar extends car{
>>>>>>> origin/main

    @Override
   void accelerate(){
    System.out.println("Fuelcar is asselerating at 10km/h");

    }
    @Override
    void brake(){
         System.out.println("FuelCar is stopped");

    }




}
<<<<<<< HEAD
class AbstractElectricCar extends AbstractCar{
=======
class ElectricCar extends car{
>>>>>>> origin/main
    @Override
    void  accelerate(){
        System.out.println("Electriccar is asselerating at 10km/h");

    }
    @Override
    void brake(){
         System.out.println("ElectricCar is stopped");

    }


}
