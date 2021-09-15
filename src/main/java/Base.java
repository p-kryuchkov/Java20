/**
 * @author Pavel Kryuchkov
 * @param x - Первое число
 * @param y - Второе число
 * @param z - Знак арифметического действия
 * @return Результат арифметического действия
 * @see #main
 */

//Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
// Использовать комментарии и JavaDoc при описании метода.
// Использовать форматирование при выводе результата в консоль.
// Полученный результат округлять до 4-х знаков после запятой.

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Выберите программу:%n Калькулятор - 1 %n Максимальная длина слов - 2%n");
        int program = in.nextInt();
        if (program == 1) {
            Scanner xin = new Scanner(System.in);
            System.out.println("Введите первое число:");
            double x = xin.nextDouble();
            Scanner yin = new Scanner(System.in);
            System.out.println("Введите второе число:");
            double y = yin.nextDouble();
            Scanner oin = new Scanner(System.in);
            System.out.println("Введите знак знак арифметического действия:");
            String z = oin.nextLine();
            switch (z) {
                case "+":
                    System.out.printf("x + y = %.4f%n", (x + y));
                    break;
                case "-":
                    System.out.printf("x - y = %.4f%n", (x - y));
                    break;
                case "*":
                    System.out.printf("x * y = %.4f%n", (x * y));
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("На ноль делить нельзя");
                    } else {
                        System.out.printf("x / y = %.4f%n" + (x / y));
                    }
                    break;
            }
        } else if (program == 2) {
            Scanner arraysizein = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int arraysize = arraysizein.nextInt();
            String[] array = new String[arraysize];
            int[] arraycount = new int[arraysize];
            for (int i = 0; i < arraysize; i++) {
                Scanner textin = new Scanner(System.in);
                System.out.println("Введите слово");
                String text = textin.nextLine();
                array[i] = text;
                arraycount[i] = text.length();
            }
            int max = arraycount[0];
            String maxword = array[0];
            for (int j = 0; j < arraycount.length; j++) {
                if (arraycount[j] > max) maxword = array[j];
            }
            System.out.println("Самое длинное слово в массиве: " + maxword);
        } else {
            System.out.println("Неправильный выбор программы");
        }


    }
}

