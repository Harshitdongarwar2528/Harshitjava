public class GCDof2NO {
    static int GCD(int m,int n)
    {
        while (m!=n)
        {
            if (m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
    public static void main(String[] args){
System.out.println(GCD(35,56));

    }
}
