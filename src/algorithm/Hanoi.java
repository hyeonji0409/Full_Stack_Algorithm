import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원반 갯수 입력: ");
        int num = scan.nextInt();

        // 1번 기둥의 n개를 3번 기둥으로 옮김
        hanoi(1,2,3,num);
    }

    // from -> to로 원판 n이동
    static void hanoi(int from, int m, int to, int n){
        System.out.printf("f:%d m:%d t:%d, n:%d\n",from, m, to, n);

        if(n == 0)
            return;

        // 원판 n-1을 from -> m으로 이동
        hanoi(from, to, m, n-1);
        System.out.printf("원반 [%d]을 %d에서 %d로 이동\n", n, from, to);
        hanoi(m, from, to, n-1);
    }

}
