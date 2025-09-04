public class RandomNumbers {
    public static void main (String [] args) {

        //Math.random() produces a random double
        //between 0 and 1, exclusive
        //[0, 1) --- always get zero point something

        double r = Math.random();
        System.out.println(r);

        //expand the range of generated numbers to [0, 5)
        r = Math.random() * 5;
        System.out.println(r);

        //int from [0,4]

        //when casting, only the term directly to the
        //right of (int) gets cast
        //so Math.random() -- 0.something gets cast as 0
        //then multiplying by 5 is still 0
        int randInt = (int) Math.random() * 5;
        System.out.println(randInt);

        //use parentheses to make the multiplication
        //evaluate first, then cast AFTER the multiplication
        randInt = (int)(Math.random() * 5);
        System.out.println(randInt);

        //[1,5]

        //take [0,4] formula and add 1 to get [1,5]
        randInt = (int)(Math.random() * 5 ) + 1;
        System.out.println(randInt);

        //die roll [1,6]
        randInt = (int)(Math.random() * 6) + 1;
        System.out.println(randInt);

        //[10,20]
        //multiplier is how many different values are in the range
        //add-on is the starting value
        randInt = (int)(Math.random() * 11 ) + 10 ;
        System.out.println(randInt);

        //[3, 10]
        randInt = (int)(Math.random() * 8) + 3;
        System.out.println(randInt);

        //generalized formula for [min, max]
        //(int)(Math.random() * (max-min+1) ) + min
        //same as above
        randInt = (int)(Math.random() * (10-3+1) ) + 3;
        System.out.println(randInt);

        //random even numbers [50, 100]
        //start off with all numbers [25,50], then mult by 2
                                     //50-25+1
        randInt = ( (int)(Math.random() * 26) + 25  ) * 2;
        System.out.println(randInt);
    }
}
