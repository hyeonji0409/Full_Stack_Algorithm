package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);

        // 객체 저장
        map.put("apple", "사과");
        map.put("summer", "여름");
        map.put("school", "학교");
        map.put("candy", "사탕");
        map.put("water", "물");

        while(true) {
            System.out.print("찾고 싶은 단어는?");
            String search = scan.next();

            if(search.equals("exit")) {
                System.out.println("종료합니다");
                break;
            }else {
                if(map.keySet().contains(search)) {
                    System.out.println(map.get(search));
                }else {
                    System.out.println("없는 단어 입니다");
                }
            }
        }
        scan.close();
    }
}
