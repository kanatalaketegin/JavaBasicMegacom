package array;

import java.util.Arrays;

public class Matrix {
    public static void main (String[] args) {
        System.out.println("Первый метод в двухмерных массивах");
        createMatrix(2, 3);
        System.out.println("Второй метод в двухмерных массивах");
        createMatrix(3, 5);
    }

   public static void createMatrix(int a, int b) {

        int[][] array = new int[a][b];
//        array[a][b] = (int) (Math.random()*10);
       for (int i = 0; i < array.length; i++){
           for (int j = 0; j < array[i].length; j++) {
               array[i][j] = (int) (Math.random()*10);
               System.out.print(array[i][j] + "\t");
           }
           System.out.println();
       }
//       for (int[] k : array) {
//           System.out.println(Arrays.toString(k));
//       }
    }
}
