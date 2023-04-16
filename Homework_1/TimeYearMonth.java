package Homework_1;
import java.util.Scanner;
public class TimeYearMonth {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц : ");
        String month = scanner.nextLine();
        switch (month) {
            case "Декабрь", "Январь", "Февраль":
                System.out.println("Зима");
                break;
            case "Март", "Апрель", "Май":
                System.out.println("Весна");
                break;
            case "Июнь", "Июль", "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь", "Октябрь", "Ноябрь":
                break;
            default:
                System.out.println("default");

        }
    }
}
