public class rightrotatearray {
    public static void main(String[] args) {
        int A[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};


        System.out.println("Original Array:");
        for (int x : A) {
            System.out.print(x + ",");
        }
        System.out.println();


        int temp = A[A.length - 1];

               for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }


        A[0] = temp;


        System.out.println("Right Rotated Array:");
        for (int x : A) {
            System.out.print(x + ",");
        }
        System.out.println();
    }
}
