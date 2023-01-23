/*
5)Create a 2D array of integers. Develop a program which will
 calculate the sum of  even
and odd numbers for that array.
 */
public class task5 {
    public static void main(String[] args) {
        int[][] numbers = {{3, 5, 8, 2}, {28, 33, 0, 4}, {5, 3, 77, 20}};
        int sumeven = 0;
        int oddsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++) {
                if (numbers[i][k] % 2 == 0) {
               sumeven+=numbers[i][k];
                }else{
                    oddsum+=numbers[i][k];
                }

            }

        }
        System.out.println("The sum of even numbers is "+sumeven);
        System.out.println("The sum of odd numbers is "+oddsum);
    }
}