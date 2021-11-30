package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        // 중복된 값은 한 번만 저장됨
        set.add("Java");
        set.add("JDBC");
        set.add("Java");
        set.add("Servelt/JSP");
        set.add("MyBatis");

        System.out.println("총 객체 수: "+set.size());

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        set.remove("JDBC");
        set.remove("MyBatis");

        System.out.println();
        for(String element : set) {
            System.out.println(element);
        }
        
        set.clear();
        if(set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
