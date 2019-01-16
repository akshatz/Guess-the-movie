import java.io.FileNotFoundException;
public class Scrabble
{
    public static void main(String[] args) throws FileNotFoundException {
        WordGame wordgame = new WordGame("movies.txt");
        System.out.printf("The rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of.%n");
        System.out.println("Your goal is to try to figure out the movie by guessing one letter at a time.");
        System.out.printf("If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point.%n");
        System.out.println("If you lose 10 points, game over!");
        System.out.println("Let's start!");
        System.out.printf("The movie title has %d characters (including spaces and punctuation).%n", wordgame.getMovieTitle().length());
        while(!wordgame.gameEnded())
        {
            System.out.println("You are guessing:" + wordgame.getHiddenMovieTitle());
            System.out.printf("You have guessed (%d) wrong letters:%s%n", wordgame.getWrongLetters().length() / 2, wordgame.getWrongLetters());
            wordgame.guessLetter();
        }
        if(wordgame.WonGame())
        {
            System.out.println("You win!");
            System.out.println("You have guessed " + wordgame.getMovieTitle() + " correctly.");
        }
        else
        {
            System.out.printf("You have guessed (%d) wrong letters:%s%n", wordgame.getWrongLetters().length() / 2, wordgame.getWrongLetters());
            System.out.println("You lost!");
            System.out.printf("The movie title was %s%n", wordgame.getMovieTitle());
            System.out.println("Better luck next time.");
        }
    }
}
