package stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();

        stk.push("홍길동");
        stk.push("이몽룡");
        stk.push("성춘향");

        for(int i = 0; i < stk.size(); i++) {
            System.out.println(i + ": " + stk.get(i));
        }

        System.out.println("스택 크키: "+ stk.size());
        System.out.println("최상위 값: "+stk.peek());
        System.out.println("이몽룡 들어 있는가? : "+stk.contains("이몽룡"));
        System.out.println("pop 수행: "+stk.pop());

        for(int i = 0; i<stk.size(); i++){
            System.out.println(i + " : "+ stk.get(i));
        }

        System.out.println("clear 수행");
        stk.clear();
        System.out.println("empty? : "+ stk.empty());
    }
}
