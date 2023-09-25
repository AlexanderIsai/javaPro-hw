package hwArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);


        System.out.println(myArrayList);

        ArrayList<Integer> arrayListJava = new ArrayList<>();
        arrayListJava.add(1);
        arrayListJava.add(2);
        arrayListJava.add(3);
        arrayListJava.add(4);
        arrayListJava.add(5);
        arrayListJava.add(6);


        myArrayList.addWithNewArray(2, 22);
        myArrayList.addWithoutNewArray(5, 188);
        System.out.println(myArrayList);
        System.out.println(myArrayList);
        myArrayList.remove(5);
        myArrayList.trimToSize();
        System.out.println(myArrayList);

    }
}