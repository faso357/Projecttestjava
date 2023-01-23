import java.util.Scanner;

/*
7)Write a java program to
check whether a given number is prime or not?
 */
public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to check if prime or not ");
        int number = scan.nextInt();
        int count =0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println("Number is entered is a prime number ");
        }else{
            System.out.println("Number is entered is not a prime number ");
        }
    }}
