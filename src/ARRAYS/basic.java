package ARRAYS;
import java.util.*;
public class basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		//array declaration and initialize size
		int[] arr = new int[size];
		//array insertion
		for(int i=0;i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//array traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
