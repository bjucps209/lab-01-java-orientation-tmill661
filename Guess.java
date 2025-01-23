import java.util.*;

class Guess {
    //generate secret number
    public static void main(String[] args) {
        int secretNum = (int) (Math.random() * 10);
        
        int numGuesses = 0;
        int guess = 0;
        
        while (guess != secretNum) {
            Scanner guessscanner = new Scanner(System.in);
            guess = Integer.parseInt(guessscanner.nextLine());
            numGuesses += 1;

            //give feedback on guess
            if (guess < secretNum){
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            }
        }
        System.out.println("It took you " + numGuesses + " guesses");
    }

}