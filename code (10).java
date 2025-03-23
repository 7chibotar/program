// Чиботарь Руслан Владимирович ДТН-309 задание 10

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan = new
Scanner(System. in);
System.out.print("Введите первое число: " );
int numl = scan.nextInt();
System.out.print("Введите второе число:");
int num2 = scan. nextInt();
System.out.print("Введите третье число:");
int num3 = scan.nextInt();
int max = numl;
if (num2 > max){
 max = num2;}
if (num3 > max){
     max = num3;}
  System.out.println ("Максимальное число: " + max);  
}
  
}