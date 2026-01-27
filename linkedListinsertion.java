
class linkedListinsertion{
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
    void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void insertAtk(int data,int k){
        Node newNode=new Node(data);
        Node temp=head;
        if(k==0||k<1){
            System.out.println("invalid");
            return;
        }
        if(k==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        for(int i=1;i<k-1&&temp!=null;i++){
            temp=temp.next;
        }
       
        if(temp==null){
            System.out.println("out of range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
        void display(){
        Node current=head;
        int count=0;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
            count++;
        }
        System.out.println("null");
         System.out.println(count);
    }
    public static void main(String args[]){
        LinkedList ls=new LinkedList();
        ls.insertBeg(10);
        ls.insertBeg(20);
        ls.insertBeg(30);
        ls.insertEnd(99);
        ls.insertAtk(100, 2);
        ls.search(101);
        ls.display();
    }
}