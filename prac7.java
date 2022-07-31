//21ce001 Harshit Ajakiya
//Aim- Display numbers in a pyramid pattern.
/*                1
               1 2 1
             1 2 4 2 1
           1 2 4 8 4 2 1
         1 2 4 8 16 8 4 2 1
      1 2 4 8 16 32 16 8 4 2 1
    1 2 4 8 16 32 64 32 16 8 4 2 1
 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 */
import java.util.Scanner;
public class prac7{

    public static void main(String[] args) {
        int n = 0;
        final String string = " ";
        for (int r = 0; r <= 7; r++) {
            for (int c = 1; c <= 7 - r; c++) {
                System.out.printf("%4s", string);
            }
            for (int c = 0; c <= r; c++) {
                n = (int) Math.pow(2, c);
                System.out.printf("%4d", n);
            }
            for (int c = r - 1; c >= 0; c--) {
                n = (int) Math.pow(2, c);
                System.out.printf("%4d", n);
            }
            System.out.println();
        }
    }

}