/**
 * author: nate
 * date: 13/01/2025
 */

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GameOption library = new GameOption("Welcome to the GamesLibrary");

        System.out.print("Please add a game: ");
        String gameAdd = input.nextLine();
        library.addGame(gameAdd);

        System.out.print("Please create a user: ");
        String userAdd = input.nextLine();
        library.addUser(userAdd);
        
        boolean list = true;

        while (list) {
            System.out.println("Welcome to " + library.getName());
            System.out.println("1. View List");
            System.out.println("2. Look at a game");
            System.out.println("3. View users");
            System.out.println("4. Search for a game");
            System.out.println("5. Add details for a game");
            System.out.println("6. Add new user");
            System.out.println("7. Add game to library");
            System.out.println("8. Exit");
            System.out.print("Select option: ");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    library.viewLibrary();
                    break;

                case 2:
                    System.out.print("Enter game name: ");
                    String gameName = input.nextLine();
                    library.viewGame(gameName);
                    break;

                case 3:
                    library.viewUsers();
                    break;

                case 4:
                    System.out.print("Enter game name: ");
                    String searchGameName = input.nextLine();
                    library.searchGame(searchGameName);
                    break;

                case 5:
                    System.out.print("Enter game name: ");
                    String gameName2 = input.nextLine();
                    library.checkGame(gameName2);

                    System.out.print("Enter a description: ");
                    String details = input.nextLine();
                    library.addDetails(details);
                    break;

                case 6:
                    System.out.print("input new user: ");
                    String additionalUser = input.nextLine();
                    library.addUser(additionalUser);
                    break;

                case 7:
                    System.out.print("What game would you like to add: ");
                    String additionalGame = input.nextLine();
                    library.addGame(additionalGame);
                    break;
                    
                case 8:
                    System.out.print("I hope you had an amazing time. :)");
                    list = false;
                    break;

                default:
                    System.out.println("Invalid option."); 
                    break;   

            }
        }

        input.close();

    }
}