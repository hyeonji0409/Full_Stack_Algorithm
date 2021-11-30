package set;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        int count = 0;
        for(int i = 0; set.size() < 6; i++) {
            count++;
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
            System.out.println("count: "+count);
        }
        System.out.println(set);

        // LinkedList 생성되면서 생성자로 set 전달
        List<Integer> list = new LinkedList<Integer>(set);

        System.out.println("list: "+list);
        Collections.sort(list); // 오름차순 정렬
        System.out.println(list);

        Collections.reverse(list); // 내림차순 정렬
        System.out.println(list);
    }
}
