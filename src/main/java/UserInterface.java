import java.util.Scanner;

/**
 * @author mferrufino
 */
public class UserInterface {

    public void showMenu() {
        System.out.println("===========================================");
        System.out.println("===      WELCOME FIXTURE GENERATOR      ===");
        System.out.println("===========================================");

        System.out.println("==== MENU ====");
        for (MenuOptions option: MenuOptions.values()) {
            System.out.println(option.getOptionNumber() + "." + option.getDescription());
        }
    }

    public void manageUserInput() {
        Scanner keyboard = new Scanner(System.in);
        int option;
        do {
            System.out.print("");
            System.out.print("Select option: ");
            option = keyboard.nextInt();

            switch (option) {
                case MenuOptions.CREATE_TOURNAMENT:
                    createTournament();
            }
        } while(option != MenuOptions.QUIT.getOptionNumber());
    }

    private Tournament createTournament() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter tournament name: ");
        String name = keyboard.next();
        return new Tournament(name);
    }
}
