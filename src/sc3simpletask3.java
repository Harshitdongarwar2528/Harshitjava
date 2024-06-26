import java.util.*;
public class sc3simpletask3 {
    public static void main (String[]args){
        int m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        float avg=(float)(m1+m2+m3)/3;
       if (m1+m2+m3>=70)
       {
           System.out.println("the grade is a");

       }
       else if (m1+m2+m3>=50 && m1+m2+m3<70)
        {
           System.out.println("the grade is b");

        }
       else if (m1+m2+m3>=30 && m1+m2+m3<50)
        {
           System.out.println("the grade is c");
        }
       else
            System.out.println("you are fail");
        }

    }

