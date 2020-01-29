import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        Collections.addAll(words, "tree","rain","bear", "encourage",
                "promise","soup","chess","insurance","pancakes","stream");

        //randomly choose a word to guess
        String word = words.get(randomNumber(words.size()));
        char[] wordArray = word.toCharArray();
        char[] answerArray = wordArray;
        int attempts=0;
        int attemptsLimit=6;

        //test wordArray
        for(char c : wordArray){
            System.out.print(c + " ");
        }
        System.out.println();

        //create blank array
        char[] blankArray = new char[wordArray.length];
        for(int i=0; i<blankArray.length; i++) {
            blankArray[i] = '_';
        }

        System.out.println("Welcome, let's play hangman!");
        System.out.print("Here is the word I am thinking of: ");
        for(char c : blankArray){
            System.out.print(c+" ");
        }
        System.out.println();


        while(!Arrays.equals(blankArray, answerArray) && attempts<attemptsLimit){

            System.out.print("Enter your guess: ");
            String guess = sc.next();
            char[] guessArray = guess.toCharArray();

            System.out.print("Your guess so far: ");
            for (int i=0; i < guessArray.length; i++) {
                for (int j=0; j < answerArray.length; j++) {
                    if (guessArray[i]==answerArray[j]) {
                        blankArray[j] =answerArray[j];
                    }
                }


//                for(char c: guessArray){
//                    if(c.equals(answerArray[i])){
//                        //return true;
//                }
//                //return false;
//
//                if(!answerArray.contains(guessArray[i]) {
//                    attempts += 1;
//                }
            }
            for(char c : blankArray){
                System.out.print(c + " ");
            }
            System.out.println();


            System.out.println("You have guessed incorrectly "+attempts+"/"+attemptsLimit+" times");

        }

        System.out.println("Congratulations! You guessed the word");

    }

    //random number generator
    public static int randomNumber(int x){
        Random rand = new Random();
        int randnum = rand.nextInt(x);
        return randnum;
    }

//    for(Char c: arr){
//        if(s.equals(targetValue))
//            return true;
//    }
//	return false;


}
