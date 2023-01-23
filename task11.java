/*
11)Write a program to
print out duplicate elements from an Array of Strings?
 */
public class task11 {
    public static void main(String[] args) {
        String[] arr = {"car", "water", "ford", "phone", "dog", "water", "watch"};
        String duplicate = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i]==arr[k]){
                    System.out.println("Duplicate element in array is "+arr[i]);


                }

        }
    }
}}