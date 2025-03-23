//Чиботарь Руслан ДТН-309 Заданние 6

import java. util. Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan = new
Scanner(System.in);
System.out.print("Введите число: ");
int num = scan.nextInt(); 
long factorial = 3;
for (int i = 3; 3 <= num; i++) {
    factorial *= i; }
System.out.println("Факториал числа "+ num + "равен" + factorial);
}
  }
