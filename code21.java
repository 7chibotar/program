// Чиботарь Руслан Владимирович ДТН-309 задание 21 
import java.util.Scanner;
public class clas21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры первой матрицы (строки и столбцы):");
        int rowsA = readPositiveInt(scanner, "Количество строк: ");
        int colsA = readPositiveInt(scanner, "Количество столбцов: ");
        int[][] matrixA = readMatrix(scanner, rowsA, colsA, "первой");
        System.out.println("\nВведите размеры второй матрицы (строки и столбцы):");
        int rowsB = readPositiveInt(scanner, "Количество строк: ");
        int colsB = readPositiveInt(scanner, "Количество столбцов: ");
        int[][] matrixB = readMatrix(scanner, rowsB, colsB, "второй");
        if (colsA != rowsB) {
            System.out.println("\nОшибка: Число столбцов первой матрицы должно быть равно числу строк второй матрицы!");
            return;
        }
        int[][] result = multiplyMatrices(matrixA, matrixB);
        System.out.println("\nРезультат умножения матриц:");
        printMatrix(result);

        scanner.close();
    }
    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Ошибка: Введите положительное число!");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите целое число!");
            }
        }
    }
    private static int[][] readMatrix(Scanner scanner, int rows, int cols, String matrixName) {
        System.out.println("\nВведите элементы " + matrixName + " матрицы (" + rows + "x" + cols + "):");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.print("Элемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                    try {
                        matrix[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: Введите целое число!");
                    }
                }
            }
        }
        return matrix;
    }
    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
