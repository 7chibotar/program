// Чиботарь Руслан Владимирович ДТН-309 задание 14

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = sc.nextInt();
        int sum = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("Сумма цифр числа " + number + " равна " + sum);
        sc.close();
    }
}