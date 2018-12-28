public class Scrabble
{
    public static void main(String[] args)
    {
        WordGame wordgame = new WordGame("movies.txt");
        System.out.println("Welcome to Guess the Movie!");
        System.out.println("The rules are simple, the computer randomly picks a movie title, and shows you how " + "many " + "letters it's made up of.");
        System.out.println("Your goal is to try to figure out the movie by guessing one letter at a time.");
        System.out.println("If a letter is indeed in the title the computer will reveal its correct position in" + " the " + "word, if not, you lose a point.");
        System.out.println("If you lose 10 points, game over!");
        System.out.println("Let's start!");
        System.out.println("The movie title has " + wordgame.getMovieTitle().length() + " characters (including spaces " + "and punctuation).");
        while(!wordgame.gameEnded())
        {
            System.out.println("You are guessing:" + wordgame.getHiddenMovieTitle());
            System.out.println("You have guessed (" + wordgame.getWrongLetters().length()/2 + ") wrong letters:" + wordgame.getWrongLetters());
            wordgame.guessLetter();
        }
        if(wordgame.WonGame())
        {
            System.out.println("You win!");
            System.out.println("You have guessed " + wordgame.getMovieTitle() + " correctly.");
        }
        else
        {
            System.out.println("You have guessed (" + wordgame.getWrongLetters().length()/2 + ") wrong letters:" + wordgame.getWrongLetters());
            System.out.println("You lost!");
            System.out.println("The movie title was " + wordgame.getMovieTitle());
            System.out.println("Better luck next time.");
        }
    }
}
