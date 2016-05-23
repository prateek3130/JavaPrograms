import java.io.DataInputStream;
import java.io.IOException;

public class UserInput1 {
    public static void main(String[] args) {
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("enter string");
            String s = din.readLine();
            System.out.println("enter number");
            int a = Integer.parseInt(din.readLine());
            System.out.println("string is " + s + "\nnumber is " + a);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
