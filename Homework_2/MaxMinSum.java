package Homework_2;

public class MaxMinSum {
    public void main(){
        int[] arr = { 5, 1234, 45, 67, 1005 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("MIN = " + (min));
        System.out.println("MAX = " + (max));
    }
    }

