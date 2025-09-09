public class U1Practice {

    public static void main(String [] args) {
        //warm up
        //set up int a to be random [10,20]
        //set up int b to be random [10,20]
        //print out each
        //swap the values between a and b
        //print the swapped values
        int a = (int)(Math.random() * 11 + 10);
        int b = (int)(Math.random() * 11) + 10;
        System.out.println("a is " + a + ", b is " + b);

        //doesn't work - you lose the original value of a
        //by saving over it
        //a = b;
        //b = a;

        int temp = b;
        //start each next line with how the previous line
        //ended
        b = a;
        a = temp;
        System.out.println("a is " + a + ", b is " + b);

        //swap them back
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a + ", b is " + b);

        int x = 8;
        boolean c = !( x > 3 && x%4 == 0 );
        //DeMorgan equivalent:
        //find each opposite expression and flip and/or
        c = x <= 3 || x % 4 != 0;

        //order of ops: PEMDAS
        // *, /, % all have the same priority - do left to right
        // +, - have the same priority, do left to right
        a = 9 + 7 / 2 - 3 * 3;
        //= 9 +   3   - 9
        //= 3
        System.out.println(a);

        //parentheses first
        a = (9 + 7) / 2 - 3 * 3;
        System.out.println(a);

        //a and b are both ints
        a = 10;
        b = 3;

        //right side first: int div 10/3 --> 3
        //then by assigning an int to a double,
        // it gets cast to a double and 3 becomes 3.0



        double d = a / b;
        System.out.println(d);

        d = (double) a / (double) b;
        System.out.println(d);

        d = (double) a / b;
        System.out.println(d);

        d = a / (double) b;
        System.out.println(d);

        //int div first in parentheses --> 3
        d = (double) (a/b);
        System.out.println(d);





    }

}
