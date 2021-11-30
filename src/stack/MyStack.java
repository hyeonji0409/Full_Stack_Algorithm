package stack;

public class MyStack {
    // 멤버 변수
    private int stackSize; // 스택 크기
    private int top; // 스택 포인터
    private char[] stackArr; // 스택(배열) : 배열 변수만 선언. 아직 할당되지 않음

    // 생성자: 스택 초기화
    // 배열 인덱스는 0부터 시작
    // top 초기화는 -1로 설정

    public MyStack(int stackSize) {
        top = -1;
        this.stackSize = stackSize; // 스택 크기 설정
        stackArr = new char[this.stackSize]; // 스택 배열 생성
    }

    // 메서드

    // 스택이 비었는지 확인하는 isEmpty()
    // 결과 반환: true / false
    public boolean isEmpty() {
        return top == -1; // top이 -1이면 true, 아니면 false 반환
    }

    // 스택이 가득 차있는지 확인하는 isFull()
    // 결과 반환: true / false
    // 가득 찬 상태: top이 4인 경우, (즉, stackSize -1)
    // stackSize: 5
    // 스택 index: 0,1,2,3,4
    public boolean isFull() {
        return top == stackSize-1;
    }

    // 스택에 데이터 삽입하는 push()
    // (1) 삽입 전에 Overflow 발생하는지 확인: isEmpty() 호출해서 결과 받아서 확인
    // (2) Full이 아니면 top을 하나 증가한 위치에 데이터 삽입 ++top
    // 삽입하기 위해 데이터 매개변수 받음
    // 직접 스택에 삽입하고 종료 -> 반환값 없음
    public void push(char item) {
        if(isFull()) {
            System.out.println("Stack Full. Overflow");
        }
        else{
            // 초기값이 -1이므로, push 할 때 먼저 1 증가
            stackArr[++top] = item;
        }
    }

    // 스택에 데이터를 삭제하는 pop()
    // Empty가 아니면 top 위치에 있는 데이터 삭제
    // 삭제 후 top 1 감소시켜 :top--
    //
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack Empty. UnderFlow");
            return 'E'; // 형식적인 return 값
        }
        else{
            // top 위치에 있는 데이터 반환하고 top을 1 감소시킴
            return stackArr[top--];
        }
    }

    // 스택의 최상위 데이터를 출력하는 peek()
    // (1) 먼저 스택이 비었는지 확인
    // (2) 최상위 데이터 (top 위치에 있는 데이터) 반환
    // 최상위 데이터(문자) 반환하므로 반환형 있음
    public char peek() {
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 'E';
        }
        else{
            // 현재 최상위 위치(top의 위치)의 값 반환
            return stackArr[top];
        }
    }

    // 스택의 내용을 비우는 clear()
    public void clear() {
        top = -1;
    }

    // 스택의 전체 데이터를 출력하는 showStack()
    // 출력만 하고 반환값 얻음
    // 먼저 출력하지 전에 스택이 비었는지 확인
    // 스택에 있는 모든 요소의 값 출력 (배열의 모든 요소의 값 출력)
    public void showStack() {
        if(isEmpty()) {
            System.out.println("Stack Empty");
        }
        else {
            System.out.print("Stack items: ");
            for(int i = 0; i <= top; i++){
                System.out.print(i + ":" + stackArr[i] + " ");
            }
            System.out.println("\ntop : "+ top);
        }
    }
}
