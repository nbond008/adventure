import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        System.out.println("Game start.");

        Command[] myCommands = {new Command("test"), new Command("bung")};
        Scanner key = new Scanner(System.in);
        TextParser parser = new TextParser(key);
        parser.setValidCommands(myCommands);

        parser.run();
    }
}
