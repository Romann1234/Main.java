package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("chislo 1");
        int num = in.nextInt();
        System.out.println("chislo 2");
        int num2 = in.nextInt();

        System.out.printf("+: %d \n-: %d\n /: %d \n *: %d \n ", num + num2,num - num2,num/num2, num*num2);

        in.close();





    }

}