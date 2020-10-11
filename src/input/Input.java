package input;

import java.util.Optional;

public class Input
{
    private final ValidCommand validCommand;
    private final String currentCommand;

    public Input(ValidCommand validCommand, String currentCommand)
    {
        this.validCommand = validCommand;
        this.currentCommand = currentCommand;
    }

    public Optional<ValidCommand> getValidCommand()
    {
        return Optional.ofNullable(validCommand);
    }

    public String getCurrentCommand()
    {
        return currentCommand;
    }
}
