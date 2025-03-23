// Чиботарь Руслан Владимирович ДТН-309 задание 9

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan = new
Scanner(System.in);
System.out.print("Введите число: ");
int num = scan.nextInt();
String binar = Integer.toBinaryString(num);
System.out.println("число " + num + " в бинарном формате: " + binar);
  }
}