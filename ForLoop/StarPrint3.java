package ForLoop;


public class StarPrint3 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            for (int k = 1; k <= i ; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

         /* OUTPUT
            *****
             ****
              ***
               **
                *  */