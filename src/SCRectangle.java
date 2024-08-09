

class Rectangle
{
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }


    static public class SCCrectnagle {
        public static void main(String[] args) {
            Rectangle r = new Rectangle();
            r.length=10.5;
            r.breadth=5.5;

            System.out.println("area"+r.area());
            System.out.println("perimeter"+r.perimeter());
            System.out.println("is it a square"+r.isSquare());

        }
    }
}

