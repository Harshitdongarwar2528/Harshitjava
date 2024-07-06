public class rotatinganarray
  {

    public static void main(String[] args)
    {
        int A [] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};


        for (int x:A)

          System.out.print(x+",");
          System.out.println("");
          int temp=A[0];
        for (int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for (int x:A)

            System.out.print(x+",");
        System.out.println("");

    }
}
