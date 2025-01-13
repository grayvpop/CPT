/**
 * author: nate
 * date: 13/01/2025
 */

 import java.util.ArrayList;

public class GameOption {
    private String name;
    private ArrayList<String> games;
    private ArrayList<String> users;

    public GameOption(String name) {
        this.name = name;
        this.games = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGame(String game) {
        games.add(game);
        System.out.println(game + " was added");
    }

    public void viewLibrary() {
        System.out.println("Games in " + name + ":");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }

    public void viewGame(String game) {
        if (games.contains(game)) {
            System.out.println("Details for game: " + game);
        } else {
            System.out.println("Game is not in the library =/");

        }
    }

    public void searchGme(String game) {
        if (games.contains(game)) {
            System.out.println(game + " is in the library");
        } else {
            System.out.println(game + " cannot be found");
        }
    }

    public void addUser(String user) {
        users.add(user);
        System.out.println(user + " registered");
    }

    public void viewUsers() {
        System.out.println("users:");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }
}
