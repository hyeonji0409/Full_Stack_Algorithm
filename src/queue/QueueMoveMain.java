package queue;

public class QueueMoveMain {
    public static void main(String[] args) {
        int queueSize = 5;
        QueueMove q = new QueueMove(queueSize);

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

        // 앞 공간이 비었더라도 rear가 stackSize(인덱스 4, 5개)와 동일하면 오버플로우 발생
        // 해결1. 이동 큐
        // 해결2. 원형 큐

        // 이동 큐
        System.out.println("\nf enqueue 수행");
        q.enQueue('f'); // 큐 이동 발생
        q.showQueue(); // Queue items : 0:b 1:c 2:d 3:e 4:f
        System.out.println("\n데이터 : "+ q.numOfData()); // 데이터 : 5

        System.out.println("\ng enqueue 수행");
        q.enQueue('g');
        q.showQueue();

        System.out.println("\ndequeue 수행");
        System.out.println("삭제된 값: " + q.deQueue());
        q.showQueue();

        System.out.println("\nclear 실행");
        q.clear();
        q.showQueue();

        System.out.println("\nh enqueue 수행");
        q.enQueue('h');
        q.showQueue();
    }
}
