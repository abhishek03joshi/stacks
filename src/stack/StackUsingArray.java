package stack;

public class StackUsingArray {
    int[] arr;
    int topOfStack;

    //initialize the Stack
    public StackUsingArray(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is successfully created");
    }

    //Check is stack is full
    public boolean isStackFull(){
        if(topOfStack == arr.length - 1){
            return true;
        } else{
            return false;
        }
    }

    //Check if stack is empty
    public boolean isStackEmpty(){
        if(topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    //Push operation
    public void push(int value){
        if(isStackFull()){
            System.out.println("Stack is full and no more insertions can happen");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Successfully inserted value " + value + " in the stack" + "\n\n");
        }
    }


    //Pop operation
    public void pop(){
        if(isStackEmpty()){
            System.out.println("Stack is already empty and pop cannot happen");
        } else {
            System.out.println("Popped the value " + arr[topOfStack] + "\n\n");
            arr[topOfStack] = 0;//optional
            topOfStack--;
        }
    }

    //Peek operation
    public void peek(){
        if(isStackEmpty()){
            System.out.println("Stack is already empty and pop cannot happen");
        } else {
            System.out.println("Top is stack is " + arr[topOfStack] + "\n\n");
        }
    }

    //Delete Stack
    public void deleteStack(){
        arr = null;
        System.out.println("Stack was deleted successfully");
    }

}
