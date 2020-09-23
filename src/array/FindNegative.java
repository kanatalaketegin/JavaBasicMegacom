package array;


public class FindNegative {
    public static void main (String[] args) {
        find (new int[][]{{0, 50, -4, 4, -99, 76, -71},
                           {80, -9, 10, -11, 12, -13, 14},
                             {-19, 16, -10, 18, -55, 20, -21},
                                {44, -99, 23, -74, 54, -33, 39}});
    }

    private static void find(int[][] matrix) {
        for (int[] i: matrix) {
            for (int j: i) {
                if (j < 0) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}
