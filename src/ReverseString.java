import java.util.Scanner;

public class ReverseString {
    public static void reverseStr(String str){
        int i=0;
        int j=str.length()-1;

        char[] chars = str.toCharArray();

        while(i<j){
            char ch = chars[i];
            chars[i] = chars[j];
            chars[j] = ch;
            i++;
            j--;
        }

        String res = new String(chars);

        System.out.println(res);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        reverseStr(str);
    }
}
