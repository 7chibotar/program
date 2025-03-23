//Чиботарь Руслан ДТН-309 Заданние 4
import java.util.Scanner; 
public class Myclass {
public static void main(String args[]){
Scanner scan = new Scanner (System. in) ;
System.out.print("Введите длину:");
int numl = scan.nextInt ();
System.out.print ("Введите ширину:"); 
int num2 = scan.nextInt ();
int res;
res = numl * num2;
System.out.print ("Площадь: " + res) ;
    
}
}
