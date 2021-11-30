package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("순차적으로 추가하기");
        System.out.println("ArrayList : "+add1(al));
        System.out.println("ArrayList : "+add2(ll));

        System.out.println("순차적으로 삭제하기");
        System.out.println("ArrayList: "+remove1(al));
        System.out.println("ArrayList: "+remove2(ll));
    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++) list.add(i +"");

        long end = System.currentTimeMillis();

        return end - start;
    }

    // 중간에 추가
    public static long add2(List list) {
        long start = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++) list.add(500 +"X");

        long end = System.currentTimeMillis();

        return end - start;
    }

    // 순차적으로 삭제: 역순으로 마지막 요소부터 삭제하면
    // 각 요소들을 이동하여 재배치할 필요 없음
    public static long remove1(List list) {
        long start = System.currentTimeMillis();

        for(int i = list.size()-1; i >= 0; i--) list.remove(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    // 중간 데이터 삭제하기
    // 처음 0 삭제, 이동. 1삭제, 이동, 2삭제
    public static long remove2(List list) {
        long start = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++) list.remove(i);

        long end = System.currentTimeMillis();

        return end - start;
    }
}
