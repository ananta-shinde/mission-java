package DataStructure.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> mylist = new Vector();

        //insert
        mylist.add("Virat");
        mylist.add(0,"Dhoni");
        mylist.add(2,"Rahul");

        //update
        mylist.set(0,"Bumrah");

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
