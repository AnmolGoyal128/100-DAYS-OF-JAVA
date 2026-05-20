public class Arrays {

    public static void main(String[] args) {
        int[] rollNums = new int[3];
        // 101,102,103

        rollNums[0]=101;
        rollNums[1]=102;
        rollNums[2]=103;

       System.out.println(rollNums[0]);
       System.out.println(rollNums[1]);
       System.out.println(rollNums[2]);

       System.out.println(rollNums.length);

       int x = 101;

       for(int i = 0;i<rollNums.length;i++){
        
        rollNums[i] = x;
        x++;
       }

       for(int j = 0;j>3;j++);{
        int j = 0;
        System.out.println(rollNums[j]);
        
       }

       for(int l = 0 ; l>rollNums.length ; l++){
        
        System.out.println(rollNums[l]);
        
       }

       int[][] marks = new int[3][3];

        marks[0][0]=23 ;
        marks[0][1]=27 ;
        marks[0][2]=45 ;
        marks[1][0]=89 ;
        marks[1][1]=44 ;
        marks[1][2]=67 ;
        marks[2][0]=90 ;
        marks[2][1]=28 ;
        marks[2][2]=78 ;

        System.out.println(marks[0][2]);

        for(int x1 = 0; x1<marks.length;x1++ ){
             for(int y = 0; y < marks[x1].length ;y++){
                System.out.print(marks[x1 ][y ]);

             }
             System.out.println( );
            
         }

         int [][] mark = {
            {43,73,38},
            {73,83,36},
            {29,53,83}
         };

         for(int row = 0;row<mark.length;row++){
            for(int col = 0;col<mark[row].length;col++){
                System.out.print(mark[row][col]);
            }
                
                System.out.println( );
         }



    }
}
