/*
10)Write a java program to
 find the second-largest number in the array?
 */
public class task10 {
    public static void main(String[] args) {
        int[] numbers = {20, 100, 40, 90, 50, 60};
        int max = numbers[0];
        int secondmax = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (max < number) {
                max = number;
            } else if (secondmax < number) {
                secondmax = number;
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
            }}

