import java.util.Scanner;

public class StringIsAlphanumeric {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.matches("^[a-zA-Z0-9]+$")){
            System.out.println("Alphanumeric..");
        }
        else{
            System.out.println("No..");
        }
    }
}
