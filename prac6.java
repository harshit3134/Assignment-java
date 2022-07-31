//21ce001 Harshit Ajakiya
//Aim- Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target
/*string, make a new array of the correct length, and then copy over the correct
strings.wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]*/
import java.util.Scanner;

public class prac6 {
    // static String New(String , String );

    static String New(String s, char a) {
        char[] ch = s.toCharArray();
        char[] sh = new char[s.length()];
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] != a) {
                sh[t] = ch[i];
                t++;
            }
        }
        String str = String.valueOf(sh);
        return str;

    }

    public static void main(String[] args) {
        String s;
        char t;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next().charAt(0);
        System.out.println(New(s, t));
    }
}