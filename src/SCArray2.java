import java.util.*;

public class SCArray2 {
    public static void main (String []args)
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your key ");
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key;
        key=sc.nextInt();
        for (int i=0;i<A.length;i++)
        {
            if (A[i]==key)
            {

                System.out.println("element found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("element not found");
    }
}
