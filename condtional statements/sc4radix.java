import java .util.*;
public class sc4radix {
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String num;
        System.out.println("enter a number");
        num=scan.nextLine();
        if (num.matches("[01]+"))
        {
            System.out.println("the number is binary");
        }
        else if (num.matches("[0-9]+"))
        {
            System.out.println("the number is decimal");
        }
        else if (num.matches("[0-7]"))
        {
            System.out.println("the given number is octal");
        }
        else if (num.matches("[0-9 A-Z]+")) {
            System.out.println("the number is hexadecimal");

        }

        else
        {
            System.out.println("the number is invalid");
        }
    }
}
