// Чиботарь Руслан Владимирович ДТН-309 задание 15

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int temp = Math.abs(number);
        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }
        if (number < 0) {
            reversedNumber = -reversedNumber;
        }
        System.out.println("Число с обратным порядком цифр: " + reversedNumber);

        scanner.close();
    }
}