package tile;

import java.util.List;

public class Tile
{
    private final List<Item> items;

    public Tile(List<Item> items)
    {
        this.items = items;
    }

    public void displayIntro()
    {
        System.out.println("Tile entered");
    }

    public List<Item> getItems()
    {
        return items;
    }
}
