package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

//
//Формируем отпуск. С консоли
//        Считываем два числа - количество дней отдыха и количество людей.
//        Ответ - это стоимость отпуска - произведение дней отдыха на количество людей
//
//        Обратите внимание, что при попытке ввести текст вместо числа у вас упадет ошибка.
//        Обработайте ее используя блок try-catch одним из способов, что обсуждали с вами на занятии.
public class MainTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input quantity of days");
            int days = scanner.nextInt();
            System.out.println("Input quantity of people");
            int people = scanner.nextInt();

            System.out.println(days * people);
        } catch (InputMismatchException exception){
            System.out.println("You didn`t write the number, try else");
            exception.printStackTrace();
        }


    }
}
