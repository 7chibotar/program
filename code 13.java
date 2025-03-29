// Чиботарь Руслан Владимирович ДТН-309 задание 13

import java.util.Scanner;
public class Main
{ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число: ");
    int n = sc.nextInt();
    System.out.println("Квадратный корень из " + n + " is: " + squareRoot(n));
} public static double squareRoot(int num)
    {
        double temp;
        double sqrtroot= (double) num /2;
        do
        {
            temp=sqrtroot;
            sqrtroot=(temp+(num/temp))/2;
        }
        while((temp-sqrtroot)!= 0);
        return sqrtroot;
    }
}