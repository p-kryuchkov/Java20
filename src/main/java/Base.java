/**
 * @author Pavel Kryuchkov
 * @see #main
 * @param x - Первое число
 * @param y - Второе число
 * @param z - Знак арифметического действия
 * @return Результат арифметического действия
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
                System.out.printf("x + y = %.4f", (x + y));
                break;
            case "-":
                System.out.printf("x - y = %.4f", (x - y));
                break;
            case "*":
                System.out.printf("x * y = %.4f", (x * y));
                break;
            case "/":
                System.out.printf("x / y = %.4f", (x / y));
                break;
        }

    }
}
