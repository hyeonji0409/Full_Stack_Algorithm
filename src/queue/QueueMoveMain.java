package queue;

public class MyQueueMain {
    public static void main(String[] args) {
        int queueSize = 5;
        MyQueue q = new MyQueue(queueSize);

        q.showQueue();
        System.out.println("데이터 : "+q.numOfData());

        System.out.println("\na, b, c enqueue 수행");
        q.enQueue('a');
        q.enQueue('b');
        q.enQueue('c');
        q.showQueue();
        System.out.println("\n데이터 : "+ q.numOfData());

        System.out.println("\npeek 수행 (첫 번째 값) : "+q.peek());

        System.out.println("\ndequeue 수행");
        System.out.println("삭제된 값: " + q.deQueue());
        q.showQueue();
        System.out.println("\n데이터: "+q.numOfData());

        System.out.println("\npeek 수행 (첫 번째 값) : "+q.peek());

        System.out.println("\nd, e enqueue 수행");
        q.enQueue('d');
        q.enQueue('e');
        q.showQueue();
        System.out.println("\n데이터 : "+ q.numOfData());

        // 현재 큐 상태: 0이 비었고, 1~4까지 4개 데이터가 들어 있음
        System.out.println("\nf enqueue 수행");
        q.enQueue('f');
        q.showQueue();
        System.out.println("\n데이터 : "+ q.numOfData());

        // 앞 공간이 비었더라도 rear가 stackSize(인덱스 4, 5개)와 동일하면 오버플로우 발생
        // 해결1. 이동 큐
        // 해결2. 원형 큐

        System.out.println("\nclear 수행");
        q.clear();
        q.showQueue();

        System.out.println("\ng enqueue 수행");
        q.enQueue('g');
        q.showQueue();
    }
}
