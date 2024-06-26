import java.util.*;
public class PracticeSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the day");
        int day =scan.nextInt();

        switch (day) {

            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case  3 :
                System.out.println("march");
                break;
            case 4 :
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("INVALID");
                break;
        }
    }
}























/*import java.util.*;
public class PracticeSwitch {
    public static void main (String[]args)
    {
        int n=1;

        switch(n)
        {
            case 1 : System.out.println("one");
                  break;
            case 2 : System.out.println("two");
                   break;
            case 3 : System.out.println("three");
                break;

            default: System.out.println("invalid");
        }
    }
}

 */
