/**
 * Created by prateek on 28/3/16.
 */
public class Evennumber {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        if(num % 2 == 0){
            System.out.println("number is even \n");
        }else{
            System.out.println("number is odd");
        }
        for (int i = 1; i <= num ; i++) {
            if(i % 2 == 0) {
                System.out.print(" " + i);
                sum = sum + i;
            }
        }
        System.out.println("\n\n" + "sum of even numbers is " + sum);
    }
}
