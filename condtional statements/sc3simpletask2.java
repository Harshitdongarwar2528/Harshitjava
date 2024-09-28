import java.util.*;
public class sc3simpletask2 {

        public static void main (String []args){
            int age;
            Scanner sc= new Scanner(System.in);
            System.out.println("enter your age");
            age=sc.nextInt();
            if (age>=18){
                System.out.println("the child is major");
            }
            else{
                System.out.println("the child is minor");
            }

        }

}
