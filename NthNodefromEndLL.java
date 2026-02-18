
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class NthNodefromEndLL{
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
   void nthNodefromEndLL(int n){
    Node fast=head;
    Node slow=head;
    for(int i=0;i<n;i++){
        fast=fast.next;
    }
    if(fast==null){
        head=head.next;
    }
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
    

   }
    void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("null");
    }



    public static void main(String[] args){
       
        NthNodefromEndLL ndl=new NthNodefromEndLL();
        ndl.insert(10);
        ndl.insert(20);
        ndl.insert(30);
        ndl.insert(40);
        ndl.insert(50);
    
       
        ndl.nthNodefromEndLL(3);

        ndl.traverse();



    }
}