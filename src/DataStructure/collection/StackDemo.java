package DataStructure.collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack mystack = new Stack();



        mystack.push(20);

        System.out.println("current pick :"+mystack.peek());

        mystack.push(40);

        System.out.println("current pick :"+mystack.peek());

        mystack.pop();

        System.out.println("current pick :"+mystack.peek());

        mystack.search(20);

    }
}
