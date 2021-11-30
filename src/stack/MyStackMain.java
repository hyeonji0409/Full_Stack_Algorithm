package stack;

public class MyStackMain {
    public static void main(String[] args) {
        // 스택 크기 설정
        int stackSize = 5;
        MyStack stk = new MyStack(stackSize);

        System.out.print("Stack 초기 상태: ");
        stk.showStack();

        System.out.println("\npop 수행");
        stk.pop();

        System.out.println("\na, b, c push 수행");
        stk.push('a');
        stk.push('b');
        stk.push('c');
        stk.showStack();

        System.out.println("\n최상위 값: " + stk.peek());

        System.out.println("\nd, e push 수행");
        stk.push('d');
        stk.push('e');
        stk.showStack();

        System.out.println("\nf push 수행");
        stk.push('f');

        System.out.println("\npop 2번 수행");
        System.out.println("pop한 값: "+stk.pop());
        System.out.println("pop한 값: "+stk.pop());
        stk.showStack();

        System.out.println("\nclear 수행");
        stk.clear();
        stk.showStack();
    }
}
