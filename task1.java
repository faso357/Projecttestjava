import java.util.Scanner;

/*
1)Using Scanner create an array of integer values.
 After the array is created,
 calculate the sum of all stored elements in that array.
 */
public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers = new int[5];
int total=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();

            total+=numbers[i];
        }

        System.out.println("The sum of all elements is "+total);
    }

    }
