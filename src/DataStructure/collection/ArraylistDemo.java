package DataStructure.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraylistDemo {

    public static void main(String[] args) {

        Object[] names = {"banana","pineapple","cherry"};
        ArrayList fruits = new ArrayList();

        //insert
        fruits.add("apple");
        fruits.add(0,"mango");

        // bulk insert
        fruits.addAll(1,Arrays.asList(names));

        //traversal

//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }

//        for(Object obj:fruits){
//            System.out.println(obj);
//        }

        Iterator itr =fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
