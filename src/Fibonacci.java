import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){
            System.out.print(fibo(i)+" ");
        }
    }

    public static int fibo(int n){
        if(n==1 || n==2) return 1;
        else return fibo(n-2) + fibo(n-1);
    }
}