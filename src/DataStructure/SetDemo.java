package DataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set myset = new HashSet();

        //insert
        myset.add(20);
        myset.add(30);
        myset.add(20);

        //delete
        myset.remove(20);

        // size
        System.out.println("size: "+ myset.size());

        //traversal
        Iterator itr = myset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
