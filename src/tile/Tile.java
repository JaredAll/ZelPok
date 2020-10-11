package tile;

import java.util.List;

public class Tile
{
    private final List<Item> items;
    private String tileDescription;
    boolean north;
    boolean south;
    boolean east;
    boolean west;

    public Tile(List<Item> items, String tileDescription, boolean north, boolean south, boolean east, boolean west)
    {
        this.items = items;
        this.tileDescription = tileDescription;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public void printTileDescription()
    {
        System.out.println(tileDescription);
    }

    public List<Item> getItems()
    {
        return items;
    }

    public void addItem(Item itemToBeAdded){
        this.items.add(itemToBeAdded);
    }

    public void removeItem(Item itemToBeRemoved){
        items.remove(itemToBeRemoved);
    }
}
