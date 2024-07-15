public class substractionof2array {
    public static void main (String[]args)
    {
        int A[][]={{1,2,3},{2,4,6},{3,6,9}};
        int B[][]={{1,2,3},{2,3,1},{3,2,1}};
        int C[][]= new int [3][3];
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                C[i][j]=A[i][j]-B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
}


