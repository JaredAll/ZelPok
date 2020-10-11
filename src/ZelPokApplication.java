import tile.Tile;

import java.util.Collections;

public class ZelPokApplication
{
    public static void main(String[] args)
    {
        Tile tile = new Tile(Collections.emptyList());
        playTile(tile);
    }

    private static void playTile(Tile tile)
    {
        tile.displayIntro();
    }
}
