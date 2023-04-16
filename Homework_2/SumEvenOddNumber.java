package Homework_2;
public class SumEvenOddNumber {
    public  void main(){
        int[] team = new int[]{2, 20, 6, 3, 8, 1, 3, 2, 7, 9,5,5,5,5,4,865};
        int num = 0, reserve = 0, index = 0;
        for (int i = 0; i < 10; i += 2) {
            num += team[index++];
            reserve += team[index++];
        }
        System.out.println("Разница между суммой элементов : "+ Math.abs(+ num - reserve));
    }
}
