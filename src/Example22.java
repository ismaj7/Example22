import java.util.Scanner;
public class Example22 {
    public static void main (String[] argv) {
        int i = 1;
        int sum = 0;
        int product = 1;

        while (i <= 10) {
            sum = sum + i;
            product = product * i;
            i++;
        }
        System.out.println ("Sum from 1 to 10 is: " + sum);
        System.out.println ("Product from 1 to 10 is: " + product);
    }
}
