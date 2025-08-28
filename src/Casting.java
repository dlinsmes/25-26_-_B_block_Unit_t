import java.util.Scanner;
public class Casting {

    public static void main(String [] args) {
        //warm up - get input for two ints from the user and output
        //the evaluation of the first divided by the second
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = input.nextInt();
        System.out.println("enter another number");
        int num2 = input.nextInt();

        //int division - so any decimals get truncated - cut off
        System.out.println(num1 + "/" + num2 + " is " + num1/num2);
        //to get decimals for the division, at least one of the terms
        //needs to be a double (has a decimal)

        //-one way is to save the initial input as a double
        //-another way is to cast (convert) the int to a double
        double n1Double = num1; //ex: saves 9 as 9.0
        System.out.println(n1Double + "/" + num2 + " is " + n1Double/num2);

        //another way: cast directly in the operation with (double)intValue
        System.out.println(num1 + "/" + (double)num2 + " is " + num1/(double)num2);

        //assignment operator = evaluate the right, THEN assign to the left
        // 9/2 is int division bc there's decimal so you get 4
        //saving an int to a double variable adds .0 so 4 --> 4.0
        double a = 9 / 2;
        System.out.println("a is " + a);

        //when casting with (double) only the term directly to the right gets cast
        //9 gets cast so this is 9.0/2 --> 4.5
        double b = (double) 9/2;
        System.out.println("b is " + b);

        //order of ops - PEMDAS
        //since (9/2) is in parentheses, that evaluates as 4, then gets cast to 4.0
        double c = (double) (9/2);
        System.out.println("c is " + c);

        // 9 / 2.0 --> 4.5
        double d = 9 / (double) 2;
        System.out.println("d is " + d);

        //can't save a double value to an int variable
        //int n = 2.7;

        //can cast a double to an int
        //any decimals get truncated
        int n = (int)2.7;
        System.out.println("n is " + n);

        //regular rounding rule - decimal of .5 or higher goes to the next whole number
        //less than .5 stays at the same whole number
        double toRound = 3.49999;

        //only use casting and order of ops, don't need if-statements or booleans
        //add .5 to toRound to potentially change the whole number
        //THEN cast so that the decimals get truncated
        int rounded = (int)(toRound + 0.5);
        System.out.println(toRound + " rounded is " + rounded);

        //doubles are only an approximation of decimal numbers
        //sometimes the value is extremely close, but off
        //by a small decimal value
        //-the behavior isn't predictable
        a = 9.7 - 2.2;
        System.out.println("9.7 - 2.2 is " + a);

        a = 9.7 - 2.1;
        System.out.println("9.7 - 2.1 is " + a);

        a = 47.49 % 1;
        System.out.println("47.49 % 1 is " + a);

        //round to a particular decimal place (want 7.5)
        a = 9.7 - 2.2; //7.49999
        System.out.print(a + " rounded is ");

        //moving the decimal temporarily
        a = a * 10; //74.9999

        //round using the above rule
        int aRounded = (int)(a + .5); //75

        //move the decimal back
        a = aRounded / 10.0; //7.5
        System.out.println(a);


        //round to two decimal places - want 0.49
        a = 47.49 % 1; // 0.4900002
        System.out.print(a + " rounded is " );
        a = a * 100; // 49.0002
        aRounded = (int)(a + .5);
        a = aRounded / 100.0;
        System.out.println(a);
    }
}
