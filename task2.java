import java.util.Scanner;

/*
2)Using Scanner create an array of countries.
When an array is created, retrieve all values from it and
while retrieving those values print capital for each country.
(use 2 different loops).
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter countries and their capital");
        String[] countries = new String[6];
        String[] capital = new String[6];

        for (int i = 0; i < countries.length; i++) {
            countries[i] = scan.nextLine();
            capital[i] = scan.nextLine();
            System.out.println(capital[i] + " is the capital of " + countries[i]);
        }
    }
}



