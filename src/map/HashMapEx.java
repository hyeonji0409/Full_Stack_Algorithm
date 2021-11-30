package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장
        map.put("김준면", 85);
        map.put("김민석", 90);
        map.put("도경수", 95);
        map.put("김준면", 100); // 동일 키 존재. 새로운 값으로 덮어씀

        System.out.println("총 Entry 수: "+map.size());
        System.out.println(map);

        // key로 검색: value 반환
        System.out.println("김준면 검색: "+map.get("김준면"));
        // 키 값 출력
        System.out.println("100(value) 검색: "+map.keySet());

        // key와 value 출력
        for(String key : map.keySet()) System.out.println(key + " : "+ map.get(key));

        // 객체 삭제 :remove(key)
        map.remove("김민석");
        System.out.println("총 Entry 수: "+map.size());

        map.clear();
        System.out.println("총 Entry 수: "+map.size());
    }
}
