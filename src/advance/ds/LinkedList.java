package advance.ds;

public class LinkedList {
    private int[] arr =  {20,30,40};
    ;

    public LinkedList(){
    }

    public void add(int value){
        int[] newArray = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = value;
        arr=newArray;
    }

    public void addFirst(int value){
        int[] newArray = new int[arr.length+1];
        newArray[0] = value;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        arr=newArray;
    }

    public void add(int index,int value){
        int[] newArray = new int[arr.length+1];
        for (int i = 0; i < index; i++) {

            newArray[i] = arr[i];
        }
        newArray[index] = value;
        for (int i = index+1; i < arr.length; i++) {

            newArray[i] = arr[i];
        }
        arr=newArray;
    }

    public void print(){
        for (int n: arr) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;
        int n3 = 40;



        LinkedList list = new LinkedList();
        list.print();
        System.out.println("************ after **************");
        list.add(2,45);
        list.print();



    }
}
