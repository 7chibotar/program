// Чиботарь Руслан Владимирович ДТН-309 задание 23
package java;
import java.util.Scanner;
import java.util.Arrays;
public class clas23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = readPositiveInt(scanner);

        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = readInt(scanner, "Элемент " + (i + 1) + ": ");
        }
        mergeSort(array, 0, array.length - 1);
        System.out.println("\nОтсортированный массив:");
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    private static void merge(int[] array, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);
        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
    private static int readPositiveInt(Scanner scanner) {
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.print("Ошибка: введите положительное число. Попробуйте снова: ");
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.print("Ошибка: введите целое число. Попробуйте снова: ");
            }
        }
    }
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            }
        }
    }
}