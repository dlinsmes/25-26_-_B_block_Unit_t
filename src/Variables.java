import java.util.Scanner;
//Scanner lets us read input (from the keyboard, files, etc)

public class Variables {

    //this is the main method
    //for now, all code we write goes in the main method
    public static void main(String [] args) {
        System.out.print("hello world");
        //"hello world" is in quotes - it's a string
        //-strings are data that can hold text (or numbers)
        //can be used as input or output in your program
        //-if you make a number into a string (with quotes) you
        //can't do math with it

        //the print() method will output on the same line
        //-to get a new line, you can use "\n"
        System.out.print("\ngo york");

        System.out.println();
        System.out.println("new line");

        //define a variable - something that holds data to be used in the program
        //declare by saying the type - String
        //give the variable a name - username
        //assign a value - "jack"
        String username = "jack";

        //string concatenation - join strings with a +
        System.out.println("my name is " + username);

        //assign a new value to the username var
        //-don't say "String" again bc the variable is already declared/defined
        //(only declare once, the first time you reference the variable)
        username = "niko";

        System.out.println("now my name is " + username);

        //for long var names with multiple words
        //-can use camelCase
        //-can use underscores or dashes
        String friendName = "sebas";

        //append (add) to a string
        // = is the assignment operator
        //evaluate what's on the RIGHT, then assign to the LEFT
        //-take the value of friendName, add " salazar",
        // then assign that new value back to the friendName variable
        friendName = friendName + " salazar";

        System.out.println("my friend's name is " + friendName);

        //int is a numerical data type used to hold whole numbers
        //(can include zero and negatives)
        int num = 7;

        System.out.println("num is " + num);

        //invalid bc an int variable cannot hold a string value
        //num = "ivy";

        //evaluate the RIGHT (7+3 = 10), then assign that
        //value to LEFT (save over the value of num)
        num = num + 3;
        System.out.println(" + 3 is " + num);

        // + is addition
        // - subtraction
        // * multiplication
        // / division
        // % modulo (mod) - remainder after division

        //13 divided 5 is 2 remainder 3, so mod only gives the remainder
        System.out.println("13 mod 5 is " + (13 % 5));

        System.out.println("num is " + num);

        //same as
        //num = num + 7
        num += 7;

        //can use -=, *=, /= , %=
        System.out.println("+ 7 is " + num);

        //add 1 (same as num = num + 1 and num += 1)
        num++;
        System.out.println("+1 is " + num);

        //int division will only save the whole number part of the division
        //the decimal gets truncated (cut off)
        num = 7 / 2;
        System.out.println("7 / 2 is " + num);

        //no rounding up occurs in trucation - only keep the whole number
        System.out.println("99 / 100 is " + (99 / 100));

        //the double data type can hold decimal values
        double numnum = 4.99;
        System.out.println(numnum/ 5);

        //when dividing, if at least one of the
        // operands is a double (has a decimaL)
        //the evaluation will come out as a double
        System.out.println(99.0/100);
        System.out.println(99/100.0);
        System.out.println(99.0/100.0);

        //evaluates to 0 bc both operands are ints (no decimal)
        System.out.println(99/100);

        //set up a Scanner called input to get keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite whole number?");
        //save the user's number to an int variable
        int userNum = input.nextInt();

        //anything after a next__() won't run until the user provides input
        System.out.println("your number is " + userNum);

        //output the user's num multiplied by 10
        System.out.println(userNum + " times 10 is " + (userNum * 10));

        //when you need a string input after getting a numerical input,
        //the following nextLine() gets skipped so add an extra one so that the
        //input that's needed will get used
        input.nextLine();

        System.out.println("what is your name?");
        //username is already a declared String variable
        username = input.nextLine();

        System.out.println("hi " + username);

        //close the scanner when you're done getting input
        input.close();
    }
}
