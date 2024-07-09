public class deletinganarray
{
    public static void main (String[]args)
    {
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=100;
        A[3]=10;
        A[4]=12;
        A[5]=7;
         int n=5;

         for (int i=0;i<n;i++)
             System.out.print(A[i]+",");
         System.out.println("");


         int index =3;

         for (int i=index;i<n-1;i++)
             A[i]=A[i+1];
           

        for (int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");



    }

}