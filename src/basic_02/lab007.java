package basic_02;

public class lab007 {

    public static void main(String[] args) {
        // Post incremental ( a++ )
        int a = 10;
        int b = a++;

       System.out.println( "a -> " + a);   // --> 11
        System.out.println(b); // -> 10

        int d = 100;
        int c = ++d;
        //System.out.println(d);
        //System.out.println(c);
    }
}
