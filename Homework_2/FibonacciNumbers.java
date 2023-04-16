package Homework_2;
public class FibonacciNumbers {
    public void main() {
        long fib = 0;
        long[] arr = new long[100];
        arr[0] = 0;
        arr[1] = 1;
        for (long i = 2; i < arr.length; ++i) {
            arr[(int) i] = arr[(int) (i - 1)] + arr[(int) (i - 2)];
        }
        for (long i = 0; i < arr.length; ++i) {
            System.out.println(arr[(int) i]);
        }
    }
}
