class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class InsestPosLL {
    Node head;

    void insertStart(int data) {
        // your logic
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }
        else{
           newNode.next=head;
           head=newNode;
        }
    }

    void insertEnd(int data) {
        // your logic
        Node newNode=new Node(data);
        if(head==null){
            insertStart(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
        void insertAtPosition(int data, int position) {
             // your logic
        Node newNode=new Node(data);
        Node temp=head;
        if(position==0){
            insertStart(data);
        }
       while(temp.next!=null && temp.next.data!=data){
    temp=temp.next;
}


        if(temp==null){
            System.out.println("position out of bound");
            return;
        }
        temp.next=temp.next.next;
        temp.next=newNode;
        
        
    }

    // =========================
    // DELETE OPERATIONS
    // =========================

    void deleteFirst() {
        // 1. if empty → return
        // 2. move head to head.next
        // 3. if list becomes empty → update tail
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        else{
            head=head.next;
            return;
        }
    }

    void deleteByValue(int value) {
        // 1. if empty → return
        // 2. if value at head → deleteFirst
        // 3. traverse to find value
        // 4. skip the node
        // 5. if deleting tail → update tail
        if(head==null){
            System.out.println("nothing to delete");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=value){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

  
    int size() {
        // 1. traverse entire list
        // 2. count nodes
        // 3. return count
          Node temp=head;
          int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.print("count");
    }

    void printList() {
        // your logic
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
