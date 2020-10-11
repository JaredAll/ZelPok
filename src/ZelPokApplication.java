import input.CommandHandler;
import input.ValidCommand;

public class ZelPokApplication
{
    public static void main(String[] args)
    {
        while (true)
        {
            CommandHandler commandHandler = new CommandHandler();
            ValidCommand validCommand = commandHandler.handleCommand();

            System.out.println(validCommand);
        }
    }
}
