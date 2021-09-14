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
        Scanner arraysizein = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraysize = arraysizein.nextInt();
        String[] array = new String[arraysize];
        for (int i = 0; i < arraysize; i++ ) {
            Scanner textin = new Scanner(System.in);
            System.out.println("Введите текст");
            String text = textin.nextLine();
            array[i] = text;
        }
    }
}
