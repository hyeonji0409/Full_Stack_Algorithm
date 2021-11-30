package list;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");

        System.out.println("전체 내용 출력");
        for(int i = 0; i<list.size(); i++){
            System.out.println(i + " : "+list.get(i));
        }

        // 값만 가져올 때 사용하는 방법
        System.out.println("전체 내용 출력2");
        for(String item : list) {
            System.out.println(item);
        }
        
        // 세 번째 요소와 요소의 길이 출력
        System.out.println("세 번째 요소  "+list.get(2));
        System.out.println("세 번째 요소의 길이  "+list.get(2).length());
    }
}
