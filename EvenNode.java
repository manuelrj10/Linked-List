class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
} 
class EvenNode{
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
    void evenNodecheck(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        EvenNode ev=new EvenNode();
        ev.insert(10);
        ev.insert(20);
        ev.insert(33);
        ev.insert(43);
        ev.insert(50);
        ev.evenNodecheck();

    }
}