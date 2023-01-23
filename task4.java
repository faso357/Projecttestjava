/*
4) Create a 2D array or integer type where you will
store odd and even numbers. Develop a program which will identify/
print the even numbers only.
 */
public class task4 {
    public static void main(String[] args) {

        int [][] numbers = {{3,5,8,2},{28,33,0,4},{5,3,77,20}};

        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++){
                if(numbers[i][k]%2==0){
                    System.out.print(numbers[i][k]+",");
                }
            }
        }
    }
}