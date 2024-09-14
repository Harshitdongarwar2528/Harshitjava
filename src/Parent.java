 class Parent {

    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child()
    {
        System.out.println("child constructor");
    }

    public class inheritprac
    {
        public static void main (String[]args)
        {
            Child c= new Child();
        }
    }
}
