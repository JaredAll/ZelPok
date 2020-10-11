package input;

import java.util.Arrays;
import java.util.List;

public enum ValidCommand
{
    NORTH("north"),
    SOUTH("south"),
    EAST("east"),
    WEST("west"),
    PICKUP("pickup"),
    INSPECT("inspect"),
    USE("use"),
    LOOK("look"),
    KILL_SELF("killself");

    String input;

    ValidCommand(String input)
    {
        this.input = input;
    }

    static final List<ValidCommand> DIRECTIONAL_COMMANDS = Arrays.asList(
            ValidCommand.EAST,
            ValidCommand.NORTH,
            ValidCommand.SOUTH,
            ValidCommand.WEST);

    static final List<ValidCommand> INTERACTION_COMMANDS = Arrays.asList(
            ValidCommand.PICKUP,
            ValidCommand.INSPECT,
            ValidCommand.USE
    );

    static final List<ValidCommand> LOOK_COMMANDS = Arrays.asList(
            ValidCommand.LOOK
    );
}
