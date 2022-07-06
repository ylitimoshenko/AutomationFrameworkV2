package CherniakYuriy;

import java.util.Scanner;

public class ForWhileDoWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = a; i >= 0; i--) {
            for (int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            for (int k = a; k > i; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
