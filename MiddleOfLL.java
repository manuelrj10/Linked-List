class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class MiddleOfLL{
    Node head;
    //insert
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }

    void middleElement(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle element is"+slow.data);
    }
    public static void main(String[] args) {
        MiddleOfLL md=new MiddleOfLL();
        md.insert(10);
        md.insert(20);
        md.insert(30);
        md.insert(40);
        md.insert(50);
        md.middleElement();
    }
}
