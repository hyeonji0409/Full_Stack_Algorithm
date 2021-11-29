import java.util.Scanner;

public class Greedy_Coin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 최소단위 10, 최대단위 5000
        int price = 0;

        System.out.print("총 금액 입력: ");
        price = scan.nextInt();

        int[] arr = {5000,1000,500,100,50,10};
        for(int i=0; i<arr.length; i++) {
            //금액을 대입해서 자동계산
            if(price/arr[i] > 0) {
                System.out.println(arr[i]+"원: "+price/arr[i]+"개 ");
                price%=arr[i];
            }
        }
        System.out.println("잔돈: "+price+"원");
    }
}
