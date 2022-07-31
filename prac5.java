//// 21CE001 Harshit Ajakiya
//Aim-Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the
//"xx", "aa", and "az" substrings appear in the same place in both strings.stringMatch("xxcaazz", "xxbaaz") → 3 stringMatch("abc", "abc") → 2
//stringMatch("abc", "axc") → 0
import java.util.Scanner;

public class prac5 {
    static int NumRepeat(String s, String t) {
        char[] ch = s.toCharArray();
        char[] sh = t.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < t.length(); j++) {

                if (s.length() >= t.length()) {
                    if (i < t.length() - 1) {
                        if (ch[i] == sh[j] && ch[i + 1] == sh[j + 1]) {
                            count++;
                        }
                    }
                } else {
                    if (j < s.length() - 1) {
                        if (ch[i] == sh[j] && ch[i + 1] == sh[j + 1]) {
                            count++;
                        }
                    }
                }
            }
        }
        // System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String s, t;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        int l = NumRepeat(s, t);
        System.out.println(l);

    }
}
