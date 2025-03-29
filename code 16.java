// Чиботарь Руслан Владимирович ДТН-309 задание 16

import java.util.Scanner;
public class clas16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " - совершенное число.");
        } else {
            System.out.println(number + " - не является совершенным числом.");
        }
        scanner.close();
    }
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}

