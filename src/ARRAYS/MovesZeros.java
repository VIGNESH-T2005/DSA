package ARRAYS;
import java.util.*;
public class MovesZeros {

    public static void moveZeros(int[] arr) {
        int write = 0; 
        for (int read = 0; read < arr.length; read++) {
            if (arr[read] != 0) {
                arr[write] = arr[read];
                write++;
            }
        }
        while (write < arr.length) {
            arr[write] = 0;
            write++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {4, 0, 0, 7, 0, 2};
        moveZeros(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}