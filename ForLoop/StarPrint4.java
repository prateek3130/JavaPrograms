package ForLoop;


public class StarPrint4 {
    public static void main(String[] args) {
        int i;
        int l = 1;
        for (i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= l; k++) {
                System.out.print("*");
            }
            l = l + 2;
            System.out.print("\n");
        }
    }
}

      /* OUTPUT
            *
           ***
          *****
         *******
        *********  */


