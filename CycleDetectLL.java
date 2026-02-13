class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class CycleDetectLL{
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
    void detectCycle(){
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Cycle not found detected");
        }
        else{
            System.out.println("Cycle found ");
        }
         
    
    }
    public static void main(String[] args){
        CycleDetectLL cll=new CycleDetectLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(10);
        cll.insert(40);
        cll.insert(50);
        cll.detectCycle();



    }
}