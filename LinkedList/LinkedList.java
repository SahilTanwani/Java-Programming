package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        if(head == null){
        // Creating a Node
        Node newNode = new Node(data);
        size++;
        head = tail =newNode;
        return;
        }
        // Creating a Node
        Node newNode = new Node(data);
        size++;
        // New Node Next = head
        newNode.next = head;
        //newNode = head
        head = newNode;
    }
    public void addLast(int data){
        if(head==null){
            Node newNode = new Node(data);
            size++;
            head = tail = newNode;  
            return;
        }
        // Creating a Node
        Node newNode = new Node(data);
        size++;
        // tail = new Node
        tail.next = newNode;
        //newNode = tail
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
}
    public void addInmiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addInmiddle(3, 4);
        ll.print();
        System.out.println("Size = "+ll.size);
    }
}
