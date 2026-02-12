//node creation
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class CountNodesLL{
    Node head;
    //insert data
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
    //count nodes
    void countNode(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        CountNodesLL check=new CountNodesLL();
        check.insert(10);
        check.insert(20);
        check.insert(30);
        check.insert(40);
        check.countNode();
    }
}