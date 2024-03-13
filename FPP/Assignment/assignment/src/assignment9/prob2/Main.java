package assignment9.prob2;

public class Main {
    public static void main(String[] args) {
        LinkedListStack stack=new LinkedListStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Size of stack : " + stack.size());

        System.out.println("1st Peek : " + stack.peek());
        System.out.println("1st Pop : " + stack.pop());

        System.out.println("2nd Peek : " + stack.peek());
        System.out.println("2nd Pop : " + stack.pop());

        System.out.println("3rd Peek : " + stack.peek());
        System.out.println("3rd Pop : " + stack.pop());

        System.out.println("4th Peek : " + stack.peek());
        System.out.println("4th Pop : " + stack.pop());
    }
}
