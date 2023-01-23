/*
8)Write a Java Program to print
the first 10 numbers of Fibonacci series.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
public class task8 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int sum=0;
        System.out.print(num1+","+num2);
        for (int i = 0; i < 8; ++i) {

         sum = num1+num2;
             num1=num2;
             num2=sum;
            System.out.print(","+sum);
        }

}}