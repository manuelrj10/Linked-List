class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class MaxNode{
    Node head;

    //insert node
    void insert(int data){
        Node newNode =new Node(data);
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

    //maxelement
    void maxElement(){
        Node temp=head;
        int max=head.data;
        while(temp!=null){
            if(temp.data>max){
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("max element is"+max);
    }
    public static void main(String[] args){
        MaxNode max=new MaxNode();
        max.insert(10);
        max.insert(20);
        max.insert(11);
        max.insert(1234);
        max.insert(99);
        max.insert(999);
        max.maxElement();


    }
}