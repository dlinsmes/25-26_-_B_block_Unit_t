import java.util.Scanner;

public class InputPractice {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = input.nextLine();

        System.out.println("what is your favorite color?");
        String color = input.nextLine();

        System.out.println("how old are you?");
        int age = input.nextInt();

        //close the scanner after all inputs have been received
        input.close();

        System.out.println("your name is " + name +
                ", your favorite color is " + color +
                ", and you are " + age + " years old");

        //how many decades and leftover years

        //use int div to calculate decades
        //-any remaining amount (decimals) get truncated
        int decades = age / 10;

        //mod for remaining years after decades are calculated
        int remaining = age % 10;
        System.out.println("that's the same as " + decades +
                " decades and " + remaining + " years");

        //age to days
        int days = age * 365;

        // add 1 for each set of 4 years
        days += (age / 4);
        System.out.println("that's the same as " + days + " days");
    }
}
