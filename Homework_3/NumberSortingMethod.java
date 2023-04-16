package Homework_3;
import java.util.Arrays;
public class NumberSortingMethod {
    public void main() {
        int[] numbers = new int[6];
        numbers[0] = 18;
        numbers[1] = 20;
        numbers[2] = 50;
        numbers[3] = 40;
        numbers[4] = 59;
        numbers[5] = 45;
        int element = Arrays.binarySearch(numbers,18);
        System.out.println( "Номер элемента массива = " + element);
        Arrays.sort(numbers);
        System.out.println("Сортировка чисел по возрастанию   " + Arrays.toString(numbers));
        int max = numMax(numbers);
        System.out.println("Максимальное число :" + max);
    }
    private static int numMax(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
}
