package ARRAYS;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int write = 1; 

        for (int read = 1; read < arr.length; read++) {
            if (arr[read] != arr[read - 1]) { 
                arr[write] = arr[read];
                write++;
            }
        }

        return write; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};      
        int newLength = removeDuplicates(arr);
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}