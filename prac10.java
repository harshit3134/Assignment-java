/* 21ce052 Harshit Ajakiya
Aim- Implement Caesar Cipher.*/
import java.util.Scanner;

public class prac10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        char[] sh = s.toCharArray();

        System.out.print("Enter number to be shifted");
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {

            sh[i] = (char) (sh[i] + (k));

        }
        System.out.println("The cipher code is:");
        for (int i = 0; i < n; i++) {

            System.out.print(sh[i]);
        }

    }
}