class student
{
   public int rollno;
   public String name;
   public String course;
   public int m1,m2,m3;


   public int total()
   {
       return m1+m2+m3;
   }
   public float average()
   {
       return (float)total()/3;
   }
   public char garde ()
   {
       if (average()>=60)
           return 'A';
       else
           return 'B';
   }
   public String details()
   {
       return "rollno :"+rollno+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
   }

}
public class SCClassstudent {
    public static void main (String []args)
    {
   student s=new student ();
   s.rollno=1;
   s.name="harshit";
   s.course="cs";
   s.m1=90;
   s.m2=80;
   s.m3=45;


        System.out.println("total:"+s.total());
        System.out.println("Avearge:"+s.average());
        System.out.println("details\n"+s.details());
    }
}
