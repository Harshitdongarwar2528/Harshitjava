public class increasingsizeofarray {
    public static void main (String[]args)
    {
        int A[]={1,2,3,4,5};
        System.out.print(A.length);
        int B[]=new int [2*A.length];



       for (int i=0;i<A.length;i++) {
           B[i] = A[i];
       }

            System.out.print(B.length);
        System.out.print("elements of new array are : ");
        for (int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }

       }

    }

