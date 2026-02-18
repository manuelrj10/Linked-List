class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class RemoveNthNodefromstart{
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
    void removeNthpos(int n){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(n==1){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;temp!=null&&i<n-1;i++){
            temp=temp.next;
        }
        if(temp==null&&temp.next==null){
            System.out.println("out of bound");
            return;
        }
        temp.next=temp.next.next;

    }
    void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("head");
    }
    public static void main(String args[]){
        RemoveNthNodefromstart np=new RemoveNthNodefromstart();
        np.insert(10);
        np.insert(20);
        np.insert(30);
        np.insert(40);
        np.insert(50);
        np.removeNthpos(3);
        np.traverse();


    }
}