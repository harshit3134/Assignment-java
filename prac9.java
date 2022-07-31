//21ce001 Harshit Ajakiya
// Aim-The problem is to check whether a given Sudoku solution is correct.
import java.util.Scanner;

public class prac9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sh = new int[9][9];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sh[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                count = count ^ sh[i][j];
            }
        }
        if (count == 1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}