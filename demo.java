//node creation
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class demo{
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
   void reverse(){
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
    
    void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("null");
    }
public static void main(String args[]){
    demo d=new demo();
    d.insert(10);
    d.insert(20);
    d.insert(30);
    d.insert(40);
    d.reverse();
    d.traverse();

}
}