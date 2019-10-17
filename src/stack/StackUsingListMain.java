package stack;


public class StackUsingListMain {
    public static void main(String[] args) {
        StackUsingList stack = new StackUsingList();
        System.out.println("pushing values into the stack");
        for(int i=1; i<=10;i++){
            stack.push(i*10);
        }
        System.out.println();

        System.out.println("Peeking the value");
        System.out.println(stack.peek());
        System.out.println();

        System.out.println("Popping 11 values from stack");
        for(int i=1; i<=11;i++){
            System.out.println(stack.pop());
        }
        System.out.println();

    }
}
