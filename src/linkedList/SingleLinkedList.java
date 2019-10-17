package linkedList;
import node.SingleNode;

public class SingleLinkedList {
    private int value;
    private SingleNode head;
    private SingleNode tail;
    int size;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    //Check if a linked list exists
    boolean existsLinkedList(){
        return head!=null;
    }

    //Create a single linked list
    public SingleNode createSingleLinkedList(int nodeValue){
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head=node;
        tail=node;
        size=1;
        return head;
    }

    //Insert in single linked list
    public void insertLinkedList(int nodeValue, int location){
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("The linked list does not exist!");
            return;
        } else if(location == 0){
            node.setNext(head);
            head=node;
        } else if(location >= size - 1){
            tail.setNext(node);
            tail=node;
            node.setNext(null);

        } else {//Insert in between
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++){
                tempNode=tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        setSize(getSize() + 1);
    }

    //Traverse a Single linked list
    public void traverseLinkedList(){
        SingleNode tempNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(tempNode.getValue());
            if(i != size-1){
                System.out.print("->");
            }
            tempNode=tempNode.getNext();
        }
        System.out.println();
    }

    //Search a single linked list
    boolean searchNode(int nodeValue){
        SingleNode tempNode = head;
        for(int i = 0; i < size; i++){
            if(tempNode.getValue() == nodeValue){
                System.out.println("Value "+nodeValue+" is found at index "+i);
                return true;
            }
            tempNode=tempNode.getNext();
        }
        System.out.println("The value "+nodeValue+" is not found in the linked list");
        return false;
    }

    //Delete a single node in linked list
    public void deleteNode(int location){
        if(!existsLinkedList()){
            System.out.println("Linked list does not exist and cannot be deleted");
        } else if(location == 0){
            if(size == 1){
                head=tail=null;
                setSize(getSize()-1);
                return;
            }
            head=head.getNext();
            setSize(getSize()-1);
        } else if(location >= size - 1){
            if(size == 1){
                head=tail=null;
                setSize(getSize()-1);
                return;
            }
            SingleNode tempNode = head;
            for(int i=0; i < getSize()-1 ; i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(null);
            tail=tempNode;
            setSize(getSize()-1);
        } else{ //Deleting in between
            SingleNode tempNode = head;
            for(int i=0; i < location-1 ; i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
    }

    //Deleting the entire linked list
    public void deleteLinkedList(){
        System.out.println("Starting the deletion of linked list");
        head=null;
        tail=null;
        System.out.println("Linked list deleted successfully");
    }


}
