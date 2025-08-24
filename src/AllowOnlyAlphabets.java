import java.util.Scanner;

public class AllowOnlyAlphabets {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input
        String input = sc.nextLine(); //sc.next() takes everything before the 1st space.

        //processing: Traditional way
        String res="";
        for(char ch: input.toCharArray()){
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                res+=ch;
            }
        }

        //processing: Regular Expression
        if(input.matches("^[a-zA-Z]+$")){
            System.out.println("All are alphabets");
        }
        else{
            System.out.println("Not Alphabets");
        }

        //output
        System.out.println(res);
    }
}
