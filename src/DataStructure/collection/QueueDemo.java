package DataStructure.collection;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue myqeue = new ArrayDeque();
        Queue newQueue = new ArrayDeque();

        //insert
        myqeue.offer(20);
        myqeue.offer(30);
        myqeue.offer(15);

        //search
        myqeue.contains(50);


        // delete
        myqeue.poll();

        //read
        System.out.println("front :"+ myqeue.peek());
    }
}
