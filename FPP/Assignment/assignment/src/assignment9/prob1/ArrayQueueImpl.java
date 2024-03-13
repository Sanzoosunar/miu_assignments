package assignment9.prob1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if(size()==arr.length)
            resize();

        if(front<0)
            front=0;

        arr[rear]=obj;
        rear++;
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int item=arr[front];
        front++;
        return item;
    }

    public boolean isEmpty() {
        return (size()==0);
    }

    public int size() {
        return rear-Math.max(front,0);
    }

    private void resize() {
        int len=arr.length;
        int[] tempArray=new int[len+10];
        System.arraycopy(arr,0,tempArray,0,len);
        arr=tempArray;
    }
}
