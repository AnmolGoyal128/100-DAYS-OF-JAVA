

public class Encapsulation {
    public static void main(String[] args) {
        //Encapsulaton

        bankAccount ba = new bankAccount();
        // ba.balance = 100000.00;      //Wrong method any one can access

        // System.out.println(ba.balance);
        ba.deposite(457);
        ba.withdraw(657);
        ba.getBalance();

        System.out.println(ba.getBalance());

        student s1 = new student("Abhishek",34,56789,"IIT G");
        s1.getNum();
        s1.getCollege();
        s1.setNum("anuj");
        s1.setCollege("IIT G"); 
        
        System.out.println(s1.getNum());
        System.out.println(s1.getCollege());
        // System.out.println(s1.setNum("anuj"));
        // System.out.println(s1.setCollege("IIT G"));

    }
}
class bankAccount{
   private double balance;

   public void deposite(int amount){
    balance+=amount;
   }
   public void withdraw(int amount){
    //amount <= withdraw amount
    balance-=amount;

   }

   //getter/setter
   public double getBalance(){
    return balance;
   }
}

class student{
    
    private String name;
    private int rollNum;
    private int age;
    private String college;

    student(String name,int rollNum,int age,String college){
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
        this.college = college;
    }

    //getter/setter
    public String getNum(){
        return name;

    }
    public void setNum(String name){
        this.name =  name;
    }
    public String getCollege(){
        return college;

    }
    public void setCollege(String college){
        //validations --> College should be real
        this.college =  college;
    }

}
