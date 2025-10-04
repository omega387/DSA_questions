package LinkedList;

public class PrintLL {
    public PrintLL(Node head){
        Node temp;
        temp = head;
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}
