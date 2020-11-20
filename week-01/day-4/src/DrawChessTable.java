public class DrawChessTable {
    public static void main(String[] args) {
       for (int i = 1; i< 10; i++) //outer loop to print lines
       {
         for (int j = 0; j < 9; j++) {//inner loop to print chars in lines
             if (i % 2 == 0) { //even rows
                if (j % 2 == 0) {System.out.print(" ");}
                else {System.out.print("%");} }
             else { //odd rows
                     if (j % 2 == 0) {
                         System.out.print("%");}
                else{System.out.print(" ");
                         }  }
                     }
                     System.out.println();
                 }
       }
    }
