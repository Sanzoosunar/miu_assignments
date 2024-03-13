package assignment9.prob1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue=new ArrayQueueImpl();
        queue.enqueue(3);
        queue.enqueue(10);
        queue.enqueue(4);

        System.out.println("size of queue : " + queue.size());
        System.out.println("\ndeque : " + queue.dequeue());
        System.out.println("deque : " + queue.dequeue());
        System.out.println("deque : " + queue.dequeue());
        System.out.println("deque : " + queue.dequeue());
        System.out.println("size of queue : " + queue.size());

        queue.enqueue(5);
        queue.enqueue(7);
        System.out.println("size of queue after adding 5&7 : " + queue.size());
        System.out.println("deque : " + queue.dequeue());

    }
}
