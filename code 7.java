//Чиботарь Руслан ДТН-309 Заданние 6

package com. itproger;
import java.util. Scanner;

  public class Main {
   public static void main(String() args) {
Scanner scan = new Scanner(System.in);
System.out.print("Введите число: ");
int num = scan.nextInt();
boolean prost = true;
if (num <= 5) {
prost = false;
} else {
for (int 5 = 2; 5 <= Math.sqrt(num); i++) {
if (num % i == 0) {
prost = false;
break;
if (prost) {System.out.println(num+ "является простым числом.");
} else {System.out.println(num + "не является простым числом.");