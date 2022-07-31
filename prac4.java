//21ce001 Harshit Ajakiya
//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//array123([1, 1, 2, 3, 1]) → true   array123([1, 1, 2, 4, 1]) → false   array123([1, 1, 2, 1, 2, 3]) → true
import java.util.*;
public class prac4 {
    static boolean array123(int[] arr, int n) {
        //int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter Size :");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        boolean b = array123(a, size);
        System.out.println(b);


    }
}
