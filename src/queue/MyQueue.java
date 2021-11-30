package queue;

public class MyQueue {
    // 멤버 변수
    private int queueSize; // 큐의 용량
    private int front; // 전위 포인터. 첫 번째 요소 앞
    private int rear; // 후위 포인터. 마지막 요소 값과 동일
    private int num; // 현재 데이터 수
    private char[] queue; // 큐 본체 (변수 선언만. 아직 할당받지 못함)

    // 생성자에서 초기화
    public MyQueue(int queueSize){
        // 배열 사용하므로 초기값 -1로 설정
        front = rear = -1; // 큐가 비어있는 상태임을 의미
        num = 0; // 데이터 수
        this.queueSize = queueSize;
        queue = new char[queueSize];
    }

    // 큐가 비었는지 상태 확인 isEmpty()
    // true / false
    public boolean isEmpty() {
        // front와 rear 포인터가 같으면 큐가 비어있는 상태
        if(front == rear) {
            front = rear = -1;
            return true;
        }
        else return false;
    }

    // 큐가 가득 차있는 상태 확인하는 isFull()
    public boolean isFull() {
        return rear == queueSize -1;
    }

    // 큐에 데이터 삽입하는 enqueue()
    // (1) Full 인지 확인
    // (2) 데이터 삽입
    public void enQueue(char item) {
        if(isFull()) {
            System.out.println("Queue Full.");
        }else {
            queue[++rear] = item; // rear 다음 위치에 데이터 삽입
            num++; // 데이터 수 증가
        }
    }

    // 큐에서 데이터 삭제 deQueue()
    // (1) Empty인지 확인
    // (2) 데이터 삭제
    public char deQueue() {
        if(isEmpty()) {
            return 'E';
        }else{
            num--; // 데이터 수 감소
            front++; // front 증가 (front 다음 위치 값 삭제)
            return queue[front];
        }
    }

    // 큐의 첫 번째 데이터 추출하는 peek()
    // 추출해서 반환
    public char peek() {
        if(isEmpty()){
            System.out.println("peek 실패. Empty");
            return 'E';
        }else {
            // front 다음 데이터 추출해서 반환
            return queue[front + 1];
        }
    }

    // 큐 초기화하는 clear()
    public void clear() {
        front = rear = -1;
        System.out.println("clear!");
    }

    // 큐에 들어있는 모든 데이터를 출력하는 showQueue()
    public void showQueue() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
        }else {
            System.out.print("Queue items : ");
            for(int i = front+1; i<=rear; i++){
                System.out.print(i + ":" + queue[i] + " ");
            }
        }
    }

    // 데이터 개수를 반환하는 numOfData()
    public int numOfData() {
        return num;
    }

}
