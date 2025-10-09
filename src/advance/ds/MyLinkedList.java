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
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public int size(){
        if(head == null){
            return 0;
        }else{
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
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



    public void insert(int index,int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            int count = 1;
            while(count<index) {
                temp = temp.next;
                count++;
            }
            newNode.next =temp.next;
            temp.next = newNode;
        }
    }

    public void delete(int index){

        if(head == null){

        }else if(index == 0) {
            head = head.next;
        }else {
            Node temp = head;
            int count = 1;
            while (temp != null && count < index){

                temp = temp.next;
            }
            temp.next = temp.next.next;

        }
    }

    public int indexof(int value){
        if(head == null){
            return -1;
        }else{
            Node temp = head;
            int count = -1;
            while(temp != null){
                count++;
                if(temp.data == value){
                    return count;
                }
                temp = temp.next;
            }
            return count;
        }
    }

    public void deleteByValue(int value){
        if(head == null){

        }else if(head.data == value) {
            head = head.next;
        }else {
            Node temp = head;
            while (temp.next.data != value){
                temp = temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args) {
            MyLinkedList list = new MyLinkedList();
            list.insert(20);
            list.addFirst(35);
            list.insert(30);
            list.insert(2,45);
//            list.deleteByValue(35);
             list.delete(2);
            System.out.println("index : "+list.indexof(45));
            System.out.println("size :"+list.size());
            list.print();
    }
}
