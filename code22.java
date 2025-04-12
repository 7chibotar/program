// Чиботарь Руслан Владимирович ДТН-309 задание 22 
package Edureka;
import java.util.Scanner;
public class clas22 {

    public static void main(String[] args)
    {

        int n, first = 0,next = 1;

        System.out.println("Введите, как можно выводить числа фибоначчи");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("Первый " + n + " Числа Фибоначчи - это: ");
        System.out.print(first + " " + next);
        for (int i = 1; i<=n-2; ++i)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }

    }

}
}
