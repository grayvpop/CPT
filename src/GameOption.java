/**
 * author: nate
 * date: 13/01/2025
 */

 import java.util.ArrayList;
import java.util.HashSet;

public class GameOption {
    private String name;
    private HashSet<String> games;
    private HashSet<String> users;
    private ArrayList<String> details;

    public GameOption(String name) {
        this.name = name;
        this.games = new HashSet<>();
        this.users = new HashSet<>();
        this.details = new ArrayList<>();
    }


    /**
     * Gets the name of the library.
     * @return The name of the library.
    */
    public String getName() {
        return name;
    }


    /**
     * Adds a game into a list
     * @param game - outputs whether a game is added or already exists
     */
    public void addGame(String game) {
        if (games.contains(game)) {
            System.out.println(game + " already exists within this library");
        } else {
            games.add(game);
            System.out.println(game + " was added");
        }
    }

      /**
     * Views the list of games inputted into the array.
     * @param game - outputs the games inputted by recency.
     */
    public void viewLibrary() {
        System.out.println("Games in the library: ");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }


      /**
     * Views the list of games and inputted details attached.
     * @param game - outputs the details of the game.
     */
    public void viewGame(String game) {
        if (games.contains(game)) {
            System.out.println("Details for game: " + details);
        } else {
            System.out.println("Game is not in the library =/");

        }
    }

      /**
     *Checks if a game is inside the library. 
     * @param game
     */
    public void checkGame(String game) {
        if (games.contains(game)) {
            System.out.println("Game is in library");
        } else {
            System.out.println("Game is not in the library =/");

        }
    }

      /**
     * 
     * @param game
     */
    public void searchGame(String game) {
        if (games.contains(game)) {
            System.out.println(game + " is in the library");
        } else {
            System.out.println(game + " cannot be found");
        }
    }

      /**
     * 
     * @param game
     */
    public void addUser(String user) {
        if (users.contains(user)){
            System.out.println(user + " is taken");
        } else {
            users.add(user);
            System.out.println(user + " registered");
        }
    }

      /**
     * 
     * @param game
     */
    public void viewUsers() {
        System.out.println("users:");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }

      /**
     * 
     * @param game
     */
    public void addDetails(String detail) {
        details.add(detail);
        System.out.println("Added description: " + detail);
    }
}
