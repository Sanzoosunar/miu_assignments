package assignment9.prob2;

public class LinkedListStack {
    private class Node{
        private Object data;
        private Node next;
        Node(Object data){
            this.data=data;
        }
    }
    private Node stackHead;
    private int totalNodes;
    public LinkedListStack(){
        stackHead=null;
        totalNodes=0;
    }

    public void push(Object data){
        Node node=new Node(data);
        node.next=stackHead;
        stackHead=node;
        totalNodes++;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }

        Node head=stackHead;
        stackHead=head.next;
        totalNodes--;
        return head.data;
    }
    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }
        return stackHead.data;
    }

    public boolean isEmpty(){
        return totalNodes==0;
    }

    public int size(){
        return totalNodes;
    }
}
