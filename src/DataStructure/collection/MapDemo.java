package DataStructure.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap();

        // insert
        myMap.put("age",32);
        myMap.put("weight",32);


        // size
        System.out.println("size :"+ myMap.size());

        System.out.println(myMap.get("age"));

        System.out.println(myMap.entrySet());
    }
}
