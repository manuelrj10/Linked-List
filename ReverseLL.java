class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ReverseLL{
    Node head;

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
    void traverse(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}

    void reverseLL(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;    

    }
    public static void main(String[] args){
        ReverseLL rev=new ReverseLL();
        rev.insert(10);
        rev.insert(20);
        rev.insert(30);
        rev.insert(40);
        System.out.println("orginal");
        rev.traverse();
        System.out.println("Reversed");
        rev.reverseLL();
         rev.traverse();

    }
}