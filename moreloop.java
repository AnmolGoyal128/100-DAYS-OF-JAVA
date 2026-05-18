public class moreloop {
    public static void main(String[] args) {
        int i = 8;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("hello");

        for(int j = 0; j < 1; j++){  // finite loop
            System.out.println("hello");
        }
        int l=1;
        for(; l<=10; l++){  //for loop me agar initialization aur update part ko blank chod dete hai to bhi loop chalega bas condition part ko dena jaruri hai
            System.out.println(l);
        }
        for(int k = 0; k < 1; k++){  // finite loop
            System.out.println("hello");
        }
        
        


    }
}
