package DataStructure.custom;

class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
    }

}

public class MyLinkedList {

    private Node head =null;

    public void addLast(int data){
       Node newNode =new Node(data);
       if(head == null){
           head = newNode;
       }else{
           Node temp = head;
           while(temp.next != null){
               temp = temp.next;
           }
           temp.next = newNode;
       }

    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void  printList(){
          if(head == null){
              System.out.println("list is empty");
          }else{
              Node temp = head;
              while(temp != null){
                  System.out.println(temp.data);
                  temp= temp.next;
              }
          }
    }

}
