import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        Collections.addAll(words, "tree", "rain", "bear", "encourage",
                "promise", "soup", "chess", "insurance", "pancakes", "stream");

        //randomly choose a word to guess
        String word = words.get(randomNumber(words.size()));
        char[] answerArray = word.toCharArray();
        int attempts = 0;
        int attemptsLimit = 6;

//        ONLY FOR TESTING: show wordArray
//        for(char c : wordArray){
//            System.out.print(c + " ");
//        }
//        System.out.println();

        //create blank array
        char[] blankArray = new char[answerArray.length];
        for (int i = 0; i < blankArray.length; i++) {
            blankArray[i] = '_';
        }

        //welcome
        System.out.println("Welcome, let's play hangman!");
        System.out.print("Here is the word I am thinking of: ");
        for (char c : blankArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        //get guesses from user
        while (!Arrays.equals(blankArray, answerArray) && attempts < attemptsLimit) {

            System.out.print("Enter your guess: ");
            String guess = sc.next();
            char[] guessArray = guess.toCharArray();

            System.out.print("Your guess so far: ");
            for (int i = 0; i < guessArray.length; i++) {
                boolean wrongLetter = true;

                //fill in correctly guessed blanks
                for (int j = 0; j < answerArray.length; j++) {
                    if (guessArray[i] == answerArray[j]) {
                        blankArray[j] = answerArray[j];
                        wrongLetter = false;
                    }
                }
                //count incorrect guesses
                if (wrongLetter) {
                    attempts++;
                }
            }
            //display guessed letters so far
            for (char c : blankArray) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("You have guessed incorrectly " + attempts + "/" + attemptsLimit + " times");

        }
        //if user guessed the word
        if(attempts<attemptsLimit) {
            System.out.println("Congratulations! You guessed the word");
        }
        //if user guessed incorrectly
        else {
            System.out.println("Sorry, you have guessed incorrectly too many times.");
            System.out.println("The answer was: "+word);
        }

    }

    //random number generator
    public static int randomNumber(int x) {
        Random rand = new Random();
        int randnum = rand.nextInt(x);
        return randnum;
    }
}
