import java.util.Scanner;

public class StringReverseViaRecursion {
    public static String func(String str){
        //base case
        if(str.length()==1){
            return str;
        }

        char ch = str.charAt(0);
        String sub = str.substring(1);
        System.out.println(sub);

        return func(sub) + ch;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(func(str));
    }
}
