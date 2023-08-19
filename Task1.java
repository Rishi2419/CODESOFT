//Number Game
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("WELCOME TO NUMBER GAME");
            System.out.println("GUESS THE NUMBER?");
            
            NumGame numberGame = new NumGame();
            boolean guessedCorrectly = false;
            
            while (!guessedCorrectly) {
                numberGame.getUserNum(sc);
                guessedCorrectly = numberGame.checkNum();
            }
        }
    }
}

class NumGame {
    private int number;
    private int userNum;
    private int noOfGuesses = 0;

    NumGame() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void getUserNum(Scanner sc) {
        userNum = sc.nextInt();
    }

    boolean checkNum() {
        noOfGuesses++;
        
        if (userNum == number) {
            System.out.println("Congratulations! You guessed the number right.");
            System.out.println("The number is " + number);
            System.out.println("You took " + noOfGuesses + " attempts.");
            calculateScore();
            return true;
        } else if (userNum > number) {
            System.out.println("Too High...");
        } else if (userNum < number) {
            System.out.println("Too Low...");
        }
        
        return false;
    }

    void calculateScore() {
        int score;
        
        switch (noOfGuesses) {
            case 1:
            case 2:
            case 3:
                score = 100;
                break;
            case 4:
            case 5:
                score = 90;
                break;
            case 6:
            case 7:
                score = 80;
                break;
            case 8:
                score = 70;
                break;
            case 9:
                score = 60;
                break;
            default:
                score = 50;
                break;
        }
        
        System.out.println("Your Score: " + score);
    }
}
