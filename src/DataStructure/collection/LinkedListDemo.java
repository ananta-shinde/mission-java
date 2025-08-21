package DataStructure.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList mylist = new LinkedList();

        // insert
        mylist.add(20);
        mylist.addFirst("first");
        mylist.addLast("second");


        //update
        mylist.set(0,"Bumrah");

        //delete
        mylist.remove();

        // size
        System.out.println("size : "+ mylist.size());

        //search
        System.out.println("search :"+mylist.contains("Rahul"));


        // traversal
        Iterator itr = mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
