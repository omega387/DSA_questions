package StackQuestions;

import java.util.Stack;

public class QueueUsingStack {

Stack<Integer> S1 = new Stack<>();
    public void enqueue(int ele){
        S1.push(ele);
    }
    public void printqueue(){
        Stack<Integer> temp = new Stack<>();
        for (int i : S1){
            temp.push(i);
        }

        while (!temp.isEmpty()){
            System.out.print(temp.peek()+ " ");
            temp.pop();

        }
        System.out.println();
    }

    public void dequeue(){
        Stack<Integer> S = new Stack<>();
        while(!S1.isEmpty()){
            S.push(S1.peek());
            S1.pop();
        }
        S.pop();
        while(!S.isEmpty()){
            S1.push(S.peek());
            S.pop();
        }
    }

    public static void main(String[] args) {
        QueueUsingStack Q1 = new QueueUsingStack();
        Q1.enqueue(23);
        Q1.enqueue(44);
        Q1.enqueue(345);
        Q1.enqueue(435);
        Q1.enqueue(57);
        Q1.dequeue();
        Q1.printqueue();
        Q1.enqueue(87);
        Q1.dequeue();
        Q1.printqueue();


    }
}
