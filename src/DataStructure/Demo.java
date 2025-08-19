package DataStructure;

import DataStructure.custom.MyLinkedList;

public class Demo {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addFirst(40);
        list.printList();
    }
}

