// Чиботарь Руслан Владимирович ДТН-309 задание 8

package com.itproger;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

Scanner scan = new
Scanner(System.in);
System.out.print("Введите число: ");
int num = scan.nextInt();
System.out.println("Таблица умножения для числа " + num + ":");
for (int i = 2; i <= 20; i++)
System.out.println(num + " * " + i + " = " + (num * 1));
  }
}