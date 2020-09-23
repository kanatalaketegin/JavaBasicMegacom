package array;
import java.util.Arrays;

public class ArraysMethods {
    public static void main (String[] args) {
        System.out.println("Method fill: int[] a, int val");
        fill(new int[10], 33);
        System.out.println();
        System.out.println("Method fill: int[] a, fromIndex, toIndex, val");
        fill(new int[20], 4, 8,77);
        System.out.println();
        System.out.println("Method copyOf: int[] original, int newLength");
        copyOf(new int [10], new int[12]);
        System.out.println();
        System.out.println("Method sort:");
        sort(new int[] {2, 4, 23, 45, 34, 53, 1, 67, 5, 15});
    }

    static void copyOf(int[] original, int[] newLength) {
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random()*20);
            System.out.print(original[i] + ", ");
        }
        System.out.println();
        newLength = Arrays.copyOf(original, 12);
        newLength[10] = (int) (Math.random()*100);
        newLength[11] = (int) (Math.random()*100);

        for (int i = 0; i < newLength.length; i++) {
            System.out.print(newLength[i] + ", ");
        }

    }


    static void fill(int[] a, int val) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*20);
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        Arrays.fill(a, val);
        System.out.println(Arrays.toString(a));

    }
    static void fill(int[] a, int fromIndex, int toIndex, int val) {
         for (int i = 0; i < a.length; i++) {
             a[i] = (int) (Math.random()*20);
             System.out.print(a[i] + ", ");
         }
         System.out.println();
        Arrays.fill(a, fromIndex, toIndex, val);
        System.out.println(Arrays.toString(a));

    }
    static void sort(int[] array) {
        Arrays.sort(array, 0, array.length);
        for (int i: array) {
            System.out.print(i + "\t");
        }
        int index = Arrays.binarySearch(array, 0, array.length, 23);
        System.out.println();
        System.out.println(index);

    }
}
