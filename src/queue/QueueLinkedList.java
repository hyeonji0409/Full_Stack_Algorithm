package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String >();

        // 큐에 추가
        System.out.println("큐에 값 4개 삽입");
        q.add("김준면");
        q.add("김민석");
        q.add("정재현");

        q.offer("김도영");

        System.out.println("큐의 내용 출력");
        System.out.println(q);  // System.out.println(q.toString());

        System.out.println("큐의 크기 : "+ q.size());
        System.out.println("peek 수행. 첫 번째 값 출력: "+q.peek());
        
        System.out.println("첫 번째 값 삭제: "+q.remove());
        System.out.println("두 번째 값 삭제: "+q.poll());
        System.out.println(q);

        // remove("검색어")는 검색해서 삭제 가능
        System.out.println("검색한 값 없는 경우 : "+ q.remove("김민석"));
        System.out.println("검색한 값 없는 경우 : "+ q.remove("김도영"));
        System.out.println(q);
    }
}
