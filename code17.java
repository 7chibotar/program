// Чиботарь Руслан Владимирович ДТН-309 задание 17
import java.util.Scanner;

public class clas17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int gcd = findGCD(a, b);
        System.out.println("НОД чисел " + a + " и " + b + " равен " + gcd);
        scanner.close();
    }
    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
