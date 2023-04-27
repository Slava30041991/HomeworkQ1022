package Homework_3;
import java.util.Scanner;
public class TimeYearMonth_Enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц : ");
        Object String = scanner.nextLine();
       Month enam = Month.valueOf(String.toString());
        switch (enam) {
            case APRIL: case MAY:case MARCH:
                System.out.println( "Весна.");
                break;
            case NOVEMBER:case OCTOBER:case SEPTEMBER:
                System.out.println( "Осень.");
                break;
            case AUGUST:case JULY:case JUNE:
                System.out.println( "Лето.");
                break;
            case FEBRUARY:case JANUARY:case DECEMBER:
                System.out.println( "Зима.");
                break;
        }
    }
}
