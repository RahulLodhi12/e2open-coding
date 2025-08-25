import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int terms = sc.nextInt();

        int start = sc.nextInt();

        int multiplier = sc.nextInt();

        int current = start;

        for(int i=0;i<terms;i++){
            System.out.print(current + " ");
            current*=multiplier;
        }
    }
}
