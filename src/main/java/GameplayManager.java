import behaviours.Actionable;

import java.util.Scanner;

public class GameplayManager {

    private Scanner playerInput;

    public GameplayManager() {
        this.playerInput = new Scanner(System.in);
    }

//    public Actionable getCommand() {
//
//        String instruction;
//        String verb;
//        String target;
//
//        System.out.print("> ");
//        instruction = playerInput.nextLine();
//
//        Scanner parser = new Scanner(instruction);
//        if (parser.hasNext()) {
//            verb = parser.next();
//            if (parser.hasNext()) {
//                target = parser.next();
//            }
//        }

//        command = Class.forName(verb);
//
//        if(commands.isCommand(word1)) {
//            return new Command(word1, word2);
//        }
//        else {
//            return new Command(null, word2);
//        }
//
//    }

}
