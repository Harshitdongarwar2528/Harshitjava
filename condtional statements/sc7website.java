
import java.util.*;
public class sc7website {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a url");
        String url=sc.nextLine();

        String protocol=url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
        {
           System.out.println("Hyper text transfer protocol");
        }
        else if (protocol.equals("ftp"))
        {
            System.out.println("File transfer protocol");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com"))
        {
            System.out.println("COMMERCIAL WEBSITE ");
        }
        if(ext.equals("net"))
        {
            System.out.println("NETWORK WEBSITE ");
        }
        if(ext.equals("org"))
        {
            System.out.println("ORGANISATIONAL WEBSITE ");
        }

    }
}
