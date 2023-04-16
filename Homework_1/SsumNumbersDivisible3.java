package Homework_1;

import java.util.Scanner;

public class SsumNumbersDivisible3 {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        int sum = 0;
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел, которые делятся на 3 и расположены между " + firstNumber + " и " + secondNumber + ": " + sum);
    }

}
