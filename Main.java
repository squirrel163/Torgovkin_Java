import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Работа с числами
        System.out.println("Введите первое число (a):");
        int a = scanner.nextInt();
        System.out.println("Введите второе число (b):");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / (double) b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        // Задача 2: Сравнение строк
        scanner.nextLine(); // Очистка буфера после ввода числа
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Задача 3: Вывод четных чисел из массива
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
