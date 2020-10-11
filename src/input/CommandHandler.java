package input;

public class CommandHandler
{
    private final InputHandler inputHandler = new InputHandler();

    public ValidCommand handleCommand()
    {
        Input input = inputHandler.handleInput();

        while(input.getValidCommand().isEmpty())
        {
            System.out.println(input.getCurrentCommand() + " is not a valid command.");
            input = inputHandler.handleInput();
        }

        ValidCommand validCommand = input.getValidCommand()
                .orElseThrow(() -> new InputHandlerException("expected valid input"));

        handleValidCommand(validCommand);
        return validCommand;
    }

    private void handleValidCommand(ValidCommand validCommand)
    {
        if(ValidCommand.DIRECTIONAL_COMMANDS.contains(validCommand))
        {
            System.out.println("Heading " + validCommand.name().toLowerCase());
        }
        else if(ValidCommand.INTERACTION_COMMANDS.contains(validCommand))
        {
            System.out.println("What would you like to " + validCommand.name().toLowerCase() + "?");
        }
        else if(ValidCommand.LOOK_COMMANDS.contains(validCommand))
        {
            System.out.println("This room is dirty.");
        }
        else if(ValidCommand.KILL_SELF == validCommand)
        {
            System.out.println("You are dead.");
            System.exit(0);
        }
    }
}
