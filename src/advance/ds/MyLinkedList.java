package advance.ds;

class Node{
    int data;
    Node next;

    public Node(int value){
        this.data = value;
    }

}
public class MyLinkedList {
    private Node head = null;

    public void print(){
        if(head == null){
            System.out.println("list is empty");
        }else{

        }
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {

    }
}
