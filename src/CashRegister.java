import java.util.Scanner;
public class CashRegister {

    public static void main(String [] args) {
        //prompt the user for a dollar and cent amount
        //calculate and output the minimum quantity of
        //bills needed to add up to that amount
        //denominations:
        //bills - 100s, 20s, 10s, 5s, 1s
        //coins - quarters, dimes, nickels, pennies

        //stick with only concepts we've covered
        Scanner input = new Scanner(System.in);
        System.out.println("how much money do you want?");
        double amt = input.nextDouble();
        input.close();
        System.out.println("$" + amt + " is...");

        //start with the largest denomination
        //use ints for quantity - can't have a portion of a bill
        int hundreds = (int) amt / 100;
        System.out.println(hundreds + " $100 bills");
        //find the remaining amt after 100s have been accounted for
        amt = amt % 100;
    }
}
