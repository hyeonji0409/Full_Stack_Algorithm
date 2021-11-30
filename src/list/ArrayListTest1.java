package list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("단어 입력: : ");
            String s = scanner.next();
            a.add(s);
        }

        System.out.println("-----------------------------");

        int longestIndex = 0;
        System.out.print("단어 리스트: ");
        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
            if (a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }

        System.out.println("\n가장 긴 단어 : " + a.get(longestIndex));
        System.out.println("가장 긴 단어길이 : " + a.get(longestIndex).length());

    }
}
