import java.util.Scanner;

public class TextParser {
    private Command[] validCommands;
    private Scanner key;

    public TextParser(Scanner myKey) {
        key = myKey;
        validCommands = null;
    }

    public void setValidCommands(Command[] myCommands) {
        validCommands = myCommands;
    }

    public void run() {
        String[] validWords = new String[validCommands.length];
        for (int i = 0; i < validWords.length; i++) {
            validWords[i] = validCommands[i].getName();
            System.out.println(validWords[i]);
        }
        String input = "";
        int index = -1;
        while (index == -1) {
            System.out.print("\n>");
            input = key.nextLine();
            index = findByName(input, validWords);
        }
        if (index >= 0 && index < validCommands.length) {
            System.out.println(validCommands[index].getEffect());
        } else {
            System.out.println("No valid actions!\n");
        }

    }

    private int findByName(String input, String[] validWords) {
        if (validWords.length == 0) {
            return -2;
        }
        for (int i = 0; i < validWords.length; i++) {
            if (input.trim().equalsIgnoreCase(validWords[i])) {
                return i;
            }
        }

        if (input.trim().equalsIgnoreCase("help")) {
            System.out.println("Available commands:\n");
            for (String com: validWords) {
                System.out.println(com);
            }
        }

        if (input.trim().equalsIgnoreCase("quit")) {
            System.out.println("\n\n");
            System.exit(1);
        }

        return -1;
    }
}
