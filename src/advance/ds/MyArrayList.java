package advance.ds;

public class MyArrayList {
    private int[] arr =  {20,30,40};
    ;

    public MyArrayList(){
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
            newArray[i] = arr[i-1];
        }
        arr=newArray;
    }

    public void remove(int index){
        int[] newArray = new int[arr.length-1];
        int j= 0;
        int i = 0;
        while(i< newArray.length){
            if(j!=index){
                newArray[i] = arr[j];
                i++;
            }
            j++;
        }
        arr = newArray;
    }

    public void add(int index,int value){
        int[] newArray = new int[arr.length+1];
        for (int i = 0; i < index; i++) {

            newArray[i] = arr[i];
        }
        newArray[index] = value;
        for (int i = index; i < arr.length; i++) {

            newArray[i+1] = arr[i];
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



        MyArrayList list = new MyArrayList();
        list.print();
        System.out.println("************ after **************");
        list.add(2,45);
        list.print();
        list.remove(0);
        System.out.println("************ after remove **************");
        list.print();



    }
}
