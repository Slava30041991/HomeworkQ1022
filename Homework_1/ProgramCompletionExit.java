package Homework_1;
import java.util.Scanner;
public class ProgramCompletionExit {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово: ");
            String word = scanner.nextLine();
            if (word.equals("Exit")) {
                System.out.println("Конец программы");
                break;
            } else {
                System.out.println("Неправильное слово: " + word);
            }
        }
        scanner.close();
    }
}
