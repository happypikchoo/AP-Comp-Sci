import java.util.*;
public class fractiongame {
    public static void main(String[] args) {
        //run the game
        game();
    }

    //game function
    public static void game() {
        //boolean to know when game is going on or is going to end
        boolean start = true;
        //keep track of the round number
        int rounds = 1;
        //title
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        //start the questions >:D
        questions(start, rounds);

    }

    //question method
    public static void questions(boolean start, int rounds) {
        //keep track of score
        int score = 0;
        //starting the questions
        while (start) {
            //see method description
            randomfrac(rounds, score);
            System.out.println();
            //add 1 to the round number each time
            rounds++;
        }
    }

    public static fraction randomfrac() {
        return new fraction((int) (Math.random() * 10+1) , (int) (Math.random()*10+1));
    }
        //randomizing the fractions, finding the answer to the operation being performed
        public static void randomfrac(int round, int score) {
            Scanner input = new Scanner(System.in);

            //fraction object to store the answer later on
            fraction answer = new fraction();
            //Operation Symbol
            String operation = "";

            //the fractions that will be used for the question
            fraction frac1 = randomfrac();
            fraction frac2 = randomfrac();

            //performs the operation on the 2 randomized fractions
                //random number to choose which operator to use
                int randomop = (int) (Math.random()*4+1);
                //decide which operation is going to be done based on the result from randomop
                if (randomop == 1){
                    answer = fraction.add(frac1, frac2);
                    operation = "+";
                } else if (randomop == 2){
                    answer = fraction.subtract(frac1, frac2);
                    operation ="-";
                } else if (randomop == 3){
                    answer = fraction.multiply(frac1, frac2);
                    operation = "*";
                } else {
                    answer = fraction.divide(frac1, frac2);
                    operation = "/";
                }

            //question line
            System.out.println(frac1 + " " + operation + " " + frac2 + " =");

            //user types their response
            String response = input.nextLine();

            //checks if question is correct
            check(answer, response, round, score);

        }


    //check if user's answer is correct or if they want to exit game
    public static void check(fraction answer, String b, int round, int score) {
        fraction scorekeeper = new fraction(score, round);
        //first check if they want to quit
        if (b.equals("quit")) {
            System.out.println();
            System.out.println("Your win/loss ratio was "+ score + "/" + round + ", for a score of " + (int)(scorekeeper.toDouble()*100) + " percent!");
            System.exit(0);
        }
        //convert the String input to a fraction class
        fraction response = new fraction(b);
        //check if the answer is correct
        if (answer.getNum() == response.getNum() && answer.getDenom() == response.getDenom()) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong, the answer was " + answer);
        }
    }
}


