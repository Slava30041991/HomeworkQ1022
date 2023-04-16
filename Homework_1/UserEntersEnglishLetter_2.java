package Homework_1;

import java.util.Scanner;

public class UserEntersEnglishLetter_2 {
    public  void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String letter = scanner.nextLine().toLowerCase();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Гласная буква");
        } else {
            System.out.println("Согласная буква");
        }
    }
}
