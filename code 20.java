// Чиботарь Руслан Владимирович ДТН-309 задание 20 
import java.util.Scanner;
import java.util.Random;
public class clas20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");
        do {
            System.out.print("Введите вашу догадку: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else if (userGuess > secretNumber) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Поздравляю! Вы угадали число с " + attempts + " попытки(ок).");
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}
