import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.printf("%d! = ",num);
        for(int i = 1; i<=num; i++){
            System.out.printf("%d * ", (num-i+1));
        }
        System.out.print("= ");
        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        if(n <= 1) return n;
        else return factorial(n-1) * n;
    }
}
