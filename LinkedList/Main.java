package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.insertatbegining(1);
        L1.insertatbegining(2);
        L1.insertatbegining(3);
        L1.insertatbegining(4);
        L1.printll();
        L1.insertatend(0);
        L1.printll();
        L1.insertatindex(3443, 2);
        L1.printll();
    }
}
