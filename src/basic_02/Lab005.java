package basic_02;

public class Lab005 {

    public static void main(String[] args) {

       //Operator_ Unary operator
        // 1st - Post Incremental operator ( First use the vale and then change the value )
        int a = 10;
       int b = 0;
       b = (a++);

      System.out.println(a);
      System.out.println(b);

        // 2nd - Pre Incremental operator ( First changed the value  and then use the value)

        int c = 10;
        int d = 0 ;
         d = (++c);
      System.out.println("c -> " + c);
      System.out.println("d -> " + c);

        //3rd - Pre-decremental operator

        // --a1
        int a1 = 100;
        int b1 = 0;
             b1 = (--a1);

        System.out.println(a1);
        System.out.println("Pre-decremental value for b1 " + b1 );

        // first change the value (99)
        // Assign the value (99)

        // 4th - post-decremental operator
        // a1++

        int marks = 100;
        int actual = 0;
        actual = (marks--);

        System.out.println(marks);
        System.out.println("Post-decremental value for actual " + marks );

        // first Assign the value (99)
        // then change the value (99)


    }


}
