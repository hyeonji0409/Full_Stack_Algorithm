package map;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx3 {
    public static void main(String[] args) {
        HashMap<String, String[]> phone = new HashMap<>();

        phone.put("친구1", new String[] {"010-1234-5678", "02-111-1111", "fri@gmail.com"});
        phone.put("친구2", new String[] {"010-2345-6789", "02-222-2222", "fri2@gmail.com"});
        phone.put("부장", new String[] {"010-3456-7890", "02-333-3333", "boss1@gmail.com"});
        phone.put("과장", new String[] {"010-4567-8901", "02-444-4444", "boss2@gmail.com"});
        phone.put("대리", new String[] {"010-5678-9012", "02-555-5555", "boss3@gmail.com"});

        System.out.println("총 그룹 수: "+phone.size());

        // 내 연락처 모든 정보 조회
        for(String key : phone.keySet()) {
            System.out.print("key 값 출력: ");
            String [] phoneList = phone.get(key);
            for(String one : phoneList) {
                System.out.print(one + " | ");
            }
            System.out.println();
        }

        System.out.print("\n부장 검색: ");
        if(phone.containsKey("부장"))
            for(String one : phone.get("부장"))
                System.out.print(one + " | ");
    }
}
