package Method;

import java.util.Scanner;

public class Area1 {
    public static void main(String[] args) {
        int length;
        int width;

        Area1 a = new Area1();
        Scanner s = new Scanner(System.in);
        System.out.print("enter length ");
        length = s.nextInt();
        System.out.print("enter width ");
        width = s.nextInt();

        double area1 = a.area(length, width);
        System.out.println("area of rectangle is " + area1);

        double area2 = a.area(length, length);
        System.out.println("area of square is " + area2);
    }
    double area(int l, int w){
        return(l*w);
    }
}

// using non static method