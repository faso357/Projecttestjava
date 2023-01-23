/*
6)Write a program to swap 2 numbers without a temporary variable?
 */
public class task6 {
    public static void main(String[] args) {
int a=3;
int b=4;
        System.out.println("----numbers before swapping-----");
        System.out.println(a);
        System.out.println(b);
        System.out.println("------numbers after swapping-------");
        a=a+b;//a=7
        b=a-b;//b=3
        a=a-b;//b=4

        System.out.println(a);
        System.out.println(b);

    }
}