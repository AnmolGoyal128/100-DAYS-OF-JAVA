//package ArrayDSA;

//import java.util.Scanner;

public class arraypractice {
    public static void main(String[] args) {

        //transversing over complete array from 0 to n-1 index or n if i<n
        int arr[] = {12,56,78,99};
        int n = arr.length;

        for(int i =0; i<= n-1; i++){
            System.out.println("The value of my array is " + arr[i]);
        }

        //find the sum of all values in an array
        int brr[] = {67,67,89,99,100};
        int sum = 0;
        int n1 = brr.length;;
        for(int i1 = 0;i1<=n1-1;i1++){
            int value = brr[i1];
            sum = sum + value;
            System.out.println(sum);
        }
        System.out.println("the sum is " + sum);

        int crr[] = {10,20,30,40,50,60,70,80,90};
        long multiply = 1;
        int n2 = crr.length;
         for ( int i2 = 0;i2 <= n2-1;i2++){
            int val = crr[i2];
            multiply = multiply*val;
            System.out.println("The valutipy of every suscedding value is :" + multiply);


         }
         System.out.println("the multiplication of all value is :" +multiply);

         //find maximum value in an array
         int drr[] = {3,9,-5,90,99,-68};
         int n3 = drr.length;
         int maxval = drr[0];
         //compare maxval to every value in an arr
         for(int i3 =0 ; i3<= n3-1;i3++){
            if(drr[i3]>maxval){
                maxval = drr[i3];
                System.out.println(maxval);

            }
            System.out.println("the maximum value is " +maxval);
            // else{
            //     //ignore
            // }
         }
         //find the min value of an array
         int frr[] = {3,9,-5,90,99,-68};
         int n4 = frr.length;
         int minval = frr[0];
         //compare minval to every value in an arr
         for(int i4 =0 ; i4<= n4-1;i4++){
            if(frr[i4]<minval){
                minval = frr[i4];
                System.out.println(minval);

            }
            System.out.println("the minimum value is " +minval);
            // else{
            //     //ignore
            // }
         }
         int grr[][] = {
                        {7,7},
                        {3,5},
                        {6,9}
                        };
        //works only when rowlength = collength
        //for rowlength != collength
        //int collength = grr[rowindex].length;
        //int rowlength = grr.length
         int rowlength = grr.length;
         int collength = grr[0].length;

         for (int rowindex = 0;rowindex<=rowlength-1;rowindex++){
            for (int colindex = 0;colindex<=collength-1;colindex++){
                System.out.print(grr[rowindex][colindex] + " ");
            }
            System.out.println();
         }
        //  int hrr[][] = new int[4][9];
         int hrr[][] = {{1,2},
                        {3,4,5},
                        {6,7,8,9},
                        {1,2,3,4,5,6,7,8,9}
                        };
        // int rowindex1 =0;
        int rowlength1 = hrr.length;
        

        for(int rowindex1 = 0;rowindex1<=rowlength1-1;rowindex1++){
            int collength1 = hrr[rowindex1].length;
            for(int colindex1 = 0;colindex1<=collength1-1;colindex1++){
                System.out.print(hrr[rowindex1][colindex1] + " ");
            }

            System.out.println();

        }
        int jrr[][] = new int[3][4];
        //Scanner sc = new Scanner(System.in);
        for (int i = 0;i<= jrr.length-1;i++){
            for(int j =0;j<=jrr[i].length-1;j++){
                System.out.println("Provide value for row " + i + " and column " + j);
                // jrr[i][j] = sc.nextInt();
            }
        } 
        for(int rowindex2 = 0;rowindex2<=jrr.length-1;rowindex2++){
            int collength2 = jrr[rowindex2].length;
            for(int colindex2 = 0;colindex2<=collength2-1;colindex2++){
                System.out.print(jrr[rowindex2][colindex2] + " ");
            }

            System.out.println();

        }

        

    }
}
