// 21CE001 Harshit Ajakiya
//Aim-  Given a string, return a string made of the first 2 chars (if present), however include first  char  only  if  it  is  'o' and  include  the  second  only  if  it
//is  'z', so  "ozymandias" yields "oz",startOz("ozymandias") → "oz"startOz("bzoo") → "z"startOz("oxx") → "o"
import java.util.*;
public class prac2 {
    static void startoz(char str[]){
        if(str[0]=='o'){
            System.out.print("o");
        }
        if(str[1]=='z'){
            System.out.print("z");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        char[]s=str.toCharArray();
        startoz(s);

    }
}
