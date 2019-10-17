package stack;

import linkedList.SingleLinkedList;
import node.SingleNode;

public class StackUsingList {
    SingleLinkedList list;

    //constructor
    public StackUsingList(){
        list = new SingleLinkedList();
    }

    //Check if empty
    public boolean isStackEmpty(){
        if(list.getSize() == 0 || list.getHead() == null){
            System.out.println("Stack is empty");
            return true;
        } else{
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //push
    public void push(int value){
        if(list.getHead() == null){
            list.createSingleLinkedList(value);
        } else {
            list.insertLinkedList(value, 0);
        }
        System.out.println("Inserted value "+value+" in stack");
    }

    //pop
    public int pop(){
        if(isStackEmpty()){
            System.out.println("Stack is empty already, cannot pop anymore.");
            return -1;
        } else {
            int value = list.getHead().getValue();
            list.deleteNode(0);
            return value;
        }
    }

    //peek
    public int peek(){
        if(isStackEmpty()){
            System.out.println("Stack is empty already, cannot peek anymore.");
            return -1;
        } else {
            return list.getHead().getValue();
        }
    }

    //Delete stack
    public void deleteStack(){
        list.deleteLinkedList();
    }
}
