import java.util.Scanner;
public class Booleans {

    public static void main(String [] args) {

        //booleans are a data type that hold true or false
        boolean b = true;
        System.out.println("b is " + b);

        b = false;
        System.out.println("b is " + b);

        //! is negation - evaluate the opposite value
        // say as "NOT"
        b = !true;
        System.out.println("!true is " + b);

        //flip the current value
        b = !b;
        System.out.println("!b is " + b);

        // comparisons - >, <, >=, <= (less than or equal)
        int x = 8;
        System.out.println("x is " + x);

        //can assign a boolean expression to a boolean variable
        //-evaluate whether x is greater than 3, then
        //assign that true/false evaluation to the b variable
        b = x > 3;
        System.out.println("x > 3: " + b);

        //expressions can be negated
        //-8 is not greater than 8 --> false
        //false negated is true
        b = !(x > 8);
        System.out.println("!(x > 8): " + b);

        //single equals = is the assignment operator
        //double equals == is a comparison
        //-check whether the two values are the same
        b = x == 8;
        System.out.println("x == 8: " + b);

        //not equals
        b = x != 9;
        //equaivalent to
        b = !( x == 9);
        System.out.println("!(x == 9): " + b);

        //math inequality to check whether x is between
        // two values
        // 4 <= x < 10;

        //invalid for java:
        //b = 4 <= x < 10;


        //and - && - both expressions need to be true
        //for the whole expression to evaluate as true
        b = 4 <= x && x < 10;
        System.out.println("4 <= x && x < 10: " + b);

        //if one of the conditions is false, the whole
        //expression evaluates to false
        b = 4 <= x && x > 10;
        System.out.println("4 <= x && x > 10: " + b);

        //OR - || - at least one expression needs to be true
        b = 4 <= x || x > 10;
        System.out.println("4 <= x || x > 10: " + b);

        x = 0;
        System.out.println("x is " + x);
        //neither condition is true so the whole thing
        //evaluates to false
        b = 4 <= x || x > 10;
        System.out.println("4 <= x || x > 10: " + b);

        String word = "apple";
        System.out.println("word is " + word);

        //for Strings, DON'T use ==
        //-it gives inconsistent results
        //-instead use, .equals(String other)
        b = word.equals("orange");
        System.out.println("is orange: " + b);

        //order can be flipped
        b = "apple".equals(word);
        System.out.println("is apple: " + b);

        //check whether word is NOT "orange"

        //doesn't work
        //b = word.!equals("orange");

        //negate the .equals() expression
        b = ! (word.equals("orange"));

        Scanner input = new Scanner(System.in);

        //want to prompt the user to enter "a" or "b"
        //and output true if they did it correctly
        //false if not
        System.out.println("enter a or b:");
        String uInput = input.nextLine();
        b = uInput.equals("a") || uInput.equals("b");
        System.out.println(b);

        //don't want the user to enter c, d, or e
        //-if they enter c (or d or e) --> false
        //-if they enter a (or b or l or fadsfdsaf) --> true
        System.out.println("don't enter c or d or e: ");
        uInput = input.nextLine();
        b = ! ( uInput.equals("c") || uInput.equals("d") || uInput.equals("e") );
        System.out.println(b);

        //equivalent:
        b = !uInput.equals("c") && !uInput.equals("d") && !uInput.equals("e");
        System.out.println(b);

        //DeMorgan's law - distribute negations
        // !(A or B) is the same as !A and !B
        // !(A and B) is the same as !A or !B

        b = !(x > 8 && x <= 20);
        //same as
        b =  x <= 8 || x > 20;


    }
}
