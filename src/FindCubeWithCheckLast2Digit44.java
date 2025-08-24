import java.util.Scanner;

public class FindCubeWithCheckLast2Digit44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        //find cube
        long cube = (long)n*n*n;
        long cubeNum=cube;

        //approach 1: too lengthy
        int cnt=0;
        while(cube>0){
            long d = cube%10;
            if(d==4){
                cnt++;
            }
            cube=cube/10;
        }
        if(cnt==2){
            System.out.println("Last 2 digits are 44");
        }
        else{
            System.out.println("No..!");
        }


        //approach 2: simple & math
        long last2Digits = cubeNum%100;
        if(last2Digits==44){
            System.out.println("Last 2 digits are 44");
        }
        else{
            System.out.println("No..!");
        }

    }
}
