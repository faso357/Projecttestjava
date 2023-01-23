/*
9)Maximum and minimum number in the array?
 */
public class task9 {
    public static void main(String[] args) {

int [] numbers = {20,40,70,10,60,50};
int max = numbers[0];
int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            } else if (numbers[i]<min) {
                min=numbers[i];

            }
        }
        System.out.println("The max number in array is "+max);
        System.out.println("The max number in array is "+min);
    }
}