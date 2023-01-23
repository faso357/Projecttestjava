/*
3) Create a 2D array of integer values.
 Print the sum of all numbers.
 */
public class task3 {
    public static void main(String[] args) {
int [] [] numbers = {{1,2,3},{1,2,3}};
int sum =0;
        for (int[] ints : numbers) {
            for (int anInt : ints) sum += anInt;
        }
        System.out.println(" The sum of all numbers is "+sum);

        System.out.println("----------------------------------");
        int [] [] number = {{1,2,3},{1,2,3}};
        int total =0;
        for (int i = 0; i < number.length; i++) {
            for (int k = 0; k < number[i].length; k++)

                total+=numbers[i][k];
        }
        System.out.println(" The sum of all numbers is "+sum);
    }
}