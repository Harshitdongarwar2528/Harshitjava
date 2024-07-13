
public class copyinganarray {
    public static void main (String []args)
    {
        int A[]={1,2,3,4,5,6,7,8,9};

        int B[]=new int[9];

        System.out.println("print elements of A : ");
        for (int i=0;i<A.length;i++)
        {
          System.out.print(A[i]+" ");

        }
        System.out.println("print elements of B  ");
        for (int i=0;i<B.length;i++) {

            B[i] = A[i];
            System.out.print(B[i] + " ");
        }
    }

}


