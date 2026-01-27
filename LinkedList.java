


class LinkedList{
    //node creation
    static class Node{
        int data;
        Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;

    }
    }
    Node head;
    void insertBeg(int data){
       Node newNode=new Node(data);
       newNode.next=head;
       head=newNode;
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList ls=new LinkedList();
        ls.insertBeg(10);
        ls.insertBeg(20);
        ls.insertBeg(30);
        ls.display();
    }
}