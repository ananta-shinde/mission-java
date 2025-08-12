package DataStructure;

public class MyArray {

    int[] list;

    MyArray(){
        list = new int[5];
    }

    MyArray(int size){

        list = new int[size];
    }

    int length(){
        return list.length;
    }

    void update(int index,int value){
        if(index < list.length && index>=0){
            list[index] = value;
        }else{
            System.out.println("array index invalid");
        }
    }

    void printValues(){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    boolean contains(int value){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == value){
                return true;
            }
        }
        return false;
    }

    int[]  valuesGreaterthan(int value){
        int count = 0;
        int[] filteredArray = new int[5];
        for (int i = 0; i < list.length; i++) {
            if( list[i]> value){
                filteredArray[count]= list[i];
                count++;
            }
        }
        return filteredArray;
    }


}
