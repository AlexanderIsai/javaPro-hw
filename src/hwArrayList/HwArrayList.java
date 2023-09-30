package hwArrayList;

import java.util.ArrayList;
import java.util.Random;

public class HwArrayList {

    public static void main(String[] args) {

        int size = 100;
        int minValue = -100;
        ArrayList<Integer> arrayList = createRandomArrayList(size, minValue);
        System.out.println(arrayList);
        printBiggers(arrayList);
        System.out.println(getMinPositiveValue(arrayList));
    }

    public static ArrayList<Integer> createRandomArrayList(int size, int minValue) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(minValue, Math.abs(minValue)));
        }
        return arrayList;
    }

    public static void printBiggers(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1) < arrayList.get(i)) {
                System.out.print(arrayList.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static int getMinPositiveValue(ArrayList<Integer> arrayList) {
        int min = Integer.MAX_VALUE;
//        int min = getFirstPositiveValue(arrayList);
        for (int element : arrayList) {
            if (element < min && element > 0) {
                min = element;
            }
        }
        return min;
    }

    public static int getFirstPositiveValue(ArrayList<Integer> arrayList) {
        for (int integer : arrayList) {
            if (integer > 0) {
                return integer;
            }
        }
        return 0;
    }
}
