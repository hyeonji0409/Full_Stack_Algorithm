package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String >();

        System.out.println("데이터 3개 삽입");
        dq.add("포도");
        dq.add("바나나");
        dq.add("딸기");
        dq.offer("사과");
        System.out.println(dq);

        System.out.println("앞 쪽에 삽입");
        dq.addFirst("수박");
        System.out.println(dq);

        System.out.println("삽입");
        dq.add("복숭아");
        System.out.println(dq);
        // 동일한 값 삽입 가능
        dq.add("복숭아");
        System.out.println(dq);

        System.out.println("peek 수행: "+dq.peek());
        System.out.println("데크 사이즈: "+dq.size());

        System.out.println("데크 순회");
        for(String item :dq){
            System.out.print(item + " ");
        }

        System.out.println("데이터 꺼내기");
        System.out.println("remove : "+dq.remove());
        System.out.println(dq);

        // 찾아서 삭제
        System.out.println("사과 remove : "+dq.remove("사과"));
        System.out.println(dq);

        System.out.println("앞 쪽에 삽입");
        dq.addFirst("복숭아");
        System.out.println(dq);

        // 앞의 데이터를 먼저 지우는 것 확인 가능
        System.out.println("복숭아 remove : "+dq.remove("복숭아"));
        System.out.println(dq);

        System.out.println("removeAll : "+dq.removeAll(dq));
        System.out.println(dq);

    }
}
