// Чиботарь Руслан Владимирович ДТН-309 задание 18

import java.util.Scanner;
public class clas18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        double min = Math.min(num1, num2);
        System.out.println("Меньшее из двух чисел: " + min);
        scanner.close();
    }
}