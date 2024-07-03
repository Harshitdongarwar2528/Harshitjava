import java.util.Scanner;

public class SCArray3 {
    public static void main (String[]args)
    {
        int key;

        int A[]={3,9,7,8,12,6,15,5,4,100};
        int max1, max2 ;
        max1=max2=A[0];

        for (int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
               max2=max1;
                max1=A[i];
            }
            else if (A[i]>max2)

            {
                 max2=A[i];
            }
        }
        System.out.println("the second largest is  "+max2);

    }
}
