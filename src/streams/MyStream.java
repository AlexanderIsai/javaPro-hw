package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

//        1) Делит все числа на 2
//        2) Оставляет только те, которые больше, чем 25
//        3) Вычитает 30 из каждого числа
//        4) Сортирует
//        5) Выбирает только первых 5 элементов
//        6) подсчитывает сумму оставшихся элементов
public class MyStream {

    static int arrayListLength = 20;
    static int maxValueOfArrayList = 100;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = getRandomArrayList(arrayListLength);
        System.out.println(arrayList);
        Optional<Integer> result = arrayList.stream()
                .map(element -> element / 2)
                .filter(element -> element > 25)
                .map(element -> element - 30)
                .sorted()
                .limit(5)
                .reduce(Integer::sum);
        System.out.println(result);
    }

    public static ArrayList<Integer> getRandomArrayList(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arrayList.add(random.nextInt(maxValueOfArrayList));
        }
        return arrayList;
    }
}
