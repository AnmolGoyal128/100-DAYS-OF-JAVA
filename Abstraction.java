public class Abstraction {
    public static void main(String[] args) {
        // car c = new car() {};  //not fessible due to abstract class od car
        car c1 = new ElectricCar();
        c1.start();
        c1.accelerate();
        c1.brake();

        car c2 = new FuelCar();
        c2.start();
        c2.accelerate();
        c2.brake();

                
        
    }
}

abstract class car{
    void start(){
        System.out.println("Car Started");
    }
    abstract void accelerate();
        // System.out.println("car is asselerating at 10km/h");
    
    abstract void brake();
        // System.out.println("Car is stopped");
}



    

class FuelCar extends car{

    @Override
   void accelerate(){
    System.out.println("Fuelcar is asselerating at 10km/h");

    }
    @Override
    void brake(){
         System.out.println("FuelCar is stopped");

    }




}
class ElectricCar extends car{
    @Override
    void  accelerate(){
        System.out.println("Electriccar is asselerating at 10km/h");

    }
    @Override
    void brake(){
         System.out.println("ElectricCar is stopped");

    }


}
