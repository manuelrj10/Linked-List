class linkedListSearch{
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
    
    void search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("element found ");
                return;


            }
            temp=temp.next;
        }
        
            System.out.println("element not found");


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
       
        ls.search(101);
        ls.display();
    }
}