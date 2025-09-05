package DataStructure;

import DataStructure.custom.MyLinkedList;
class Data{
     int count = 0;
     static Data data;
     private Data(){

     }

     public static Data getInstance(){
         if(data == null) {
             data = new Data();
         }
          return data;
     }
}
public class Demo {

    public static void main(String[] args) {
       Data data = Data.getInstance();
        Data anotherData = Data.getInstance();
        anotherData.count = 10;
        System.out.println(data.count);
        System.out.println(anotherData.count);

    }
}

