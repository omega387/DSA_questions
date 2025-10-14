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
        L1.deleteatbegining();
        L1.printll();
        L1.deleteatend();
        L1.printll();
        L1.deleteatindex(2);
        L1.printll();
        L1.insertatbegining(11);
        L1.insertatbegining(12);
        L1.insertatbegining(13);
        L1.printll();
        L1.reverse();
        L1.printll();
        L1.printindx(4);
        System.out.println(L1.size());
        System.out.println(L1.returnindx(11));
    }
}
