import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ListItems {

    private ArrayList<String> movies;
    ListItems(String pathname) throws FileNotFoundException {
        movies = new ArrayList<String>();
        File file = new File(pathname);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            movies.add(scanner.nextLine());
        }
    }
    public String getRandomMovie() {
        int movieIndex = (int)(Math.random() * movies.size());
        return movies.get(movieIndex);
    }
}
