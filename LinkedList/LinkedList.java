package LinkedList;

public class LinkedList {
    private Node head;
    private int size;

    LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public Boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void insertatbegining(int ele){
        Node newnode = new Node(ele);
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void insertatend(int ele){
        Node newnode = new Node(ele);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    public void insertatindex(int ele,int indx){
        Node newnode = new Node(ele);
        if(indx > size){
            System.out.println("Index out of bound.");
            return;
        }
        else{
            Node P1 = head;
            Node P2 = P1.next;
            for(int i = 1; i<indx; i++){
                P1 = P1.next;
                P2 = P2.next;
            }
            P1.next = newnode;
            P1.next.next = P2;
        }
        size++;
    }

    public void deleteatbegining(){
        if(isEmpty()){
            System.out.println("List is empty.");
        }
        else{
            head = head.next;
        }
    }

    public void deleteatend(){
        if(isEmpty()){
            System.out.println("List is empty.");
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteatindex(int indx){
        Node temp = head;
        for(int i = 0; i< indx; i++){
            
        }
    }

    public void printll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
