import java.util.Scanner;

/**
 * Created by prateek on 4/3/16.
 */
public class Scannertest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        /*StringBuilder sb = new StringBuilder("hello")
                .append(", ")
                .append("world")
                .append("!");
        System.out.println(sb);*/

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        System.out.println("enter new values: ");
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}
