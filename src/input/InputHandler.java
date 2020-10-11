package input;

import java.util.Optional;
import java.util.Scanner;

public class InputHandler
{
    private final Scanner scanner = new Scanner(System.in);

    public Input handleInput()
    {
        ValidCommand validCommand = null;
        String currentCommand = "";
        if (scanner.hasNextLine())
        {
            String input = scanner.nextLine();
            String[] inputCommand = input.split("\\s+");

            currentCommand = inputCommand[0];

            for (ValidCommand command : ValidCommand.values())
            {
                if (currentCommand.equalsIgnoreCase(command.input))
                {
                    validCommand = command;
                }
            }
        }
        return new Input(validCommand, currentCommand);
    }
}
