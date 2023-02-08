import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);

        System.out.print("\nEnter the \"a\" value in ax^2+bx+c: ");
        int aValue = scanning.nextInt();

        System.out.print("\nEnter the \"b\" value in ax^2+bx+c: ");
        int bValue = scanning.nextInt();

        System.out.print("\nEnter the \"c\" value in ax^2+bx+c: ");
        int cValue = scanning.nextInt();

        System.out.print("\nEnter the \"Symbol\" to be used   : ");
        String Symbol = scanning.next();

        Data information = new Data(50,100);
        System.out.println("");
        information.Graph(aValue, bValue, cValue,Symbol); //
        information.Display();

    }
}