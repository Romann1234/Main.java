package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("chislo 1");
        int num = in.nextInt();
        System.out.println("chsilo 2");
        int num2 = in.nextInt();
        System.out.println("viberite operaciu: 1.+ 2.- 3./ 4.* ");
        int num3 = in.nextInt();
        switch (num3){
            case 1:
                System.out.printf("+: %d",num+num2);
                break;
            case 2:
                System.out.printf("-: %d",num-num2);
                break;
            case 3:
                System.out.printf("/: %d",num/num2);
                break;
            case 4:
                System.out.printf("*: %d",num*num2);
                break;
            default:
                System.out.println("not found");
        }


        in.close();





    }

}