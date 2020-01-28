import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        Collections.addAll(words, "tree","rain","bear", "encourage",
                "promise","soup","chess","insurance","pancakes","stream");

        //randomly choose a word to guess
        String word = words.get(randomNumber(words.size()));

        System.out.println("Welcome, let's play hangman!");
        System.out.println("Here is the word I am thinking of:");

        System.out.print("Enter your guess: ");
        System.out.println("Your guess so far: _ _ _ _");

//        ^^^Repeat^^^
//        System.out.print("Enter your guess: ");
//        System.out.println("You have guessed incorrectly 1/X times.");
//        System.out.println("Your guess so far: a _ _ _ a _");




    }

    //random number generator
    public static int randomNumber(int x){
        Random rand = new Random();
        int randnum = rand.nextInt(x);
        return randnum;
    }


}
