package hwArrayList;

import java.util.Arrays;

public class MyArrayList {

    private int[] array;
    private int size;

    public MyArrayList() {
        array = new int[10];
    }

    public void add(int value) {
        if (size == array.length) {
            grow();
        }
        array[size] = value;
        size++;
    }

    private void grow() {
        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void reduce() {
        if(array.length >= size * 2){
            int[] newArray = new int[array.length / 2];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        if (array == null) {
            return 0;
        }

        return size;
    }

    public void addWithoutNewArray(int index, int element) {
        add(element);
        int temp = array[index];
        array[index] = array[size - 1];
        for (int i = size - 1; i > index + 1; i--) {
            array[i] = array[i - 1];
        }
        array[index + 1] = temp;
    }

    public void addWithNewArray(int index, int element) {
        int[] newArray = new int[array.length + 1];
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        size--;
        reduce();
    }

    public void trimToSize() {
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
