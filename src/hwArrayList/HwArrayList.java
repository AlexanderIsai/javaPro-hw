package hwArrayList;

import java.util.ArrayList;
import java.util.Random;

public class HwArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = createRandomArrayList(100);
        System.out.println(arrayList);
        printBiggers(arrayList);
        System.out.println(getMinPositiveValue(arrayList));
    }

    public static ArrayList<Integer> createRandomArrayList(int size){
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }

    public static void printBiggers(ArrayList<Integer> arrayList){
        for (int i = 1; i < arrayList.size(); i++) {
            if(arrayList.get(i - 1) < arrayList.get(i)){
                System.out.print(arrayList.get(i) + " ");
            }
        }
        System.out.println();
    }
    public static int getMinPositiveValue(ArrayList<Integer> arrayList){
        int min = getFirstPositiveValue(arrayList);
        for (int element: arrayList) {
            if(element < min && element > 0){
                min = element;
            }
        }
        return min;
    }
    public static int getFirstPositiveValue(ArrayList<Integer> arrayList){
        for (Integer integer : arrayList) {
            if (integer > 0) {
                return integer;
            }
        }
        return 0;
    }
}
