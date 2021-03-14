package Map;

import tile.Tile;

public class TileGeneratorFactory
{
    public Tile generateTile(int column, int row)
    {
        Tile tile;
        if(column == 0 && row == 0)
        {
            tile = new TileZeroZeroGenerator().generateTile();
        } else if(column == 1 && row == 0)
        {
            tile = new TileOneZeroGenerator().generateTile();
        } else if(column == 0 && row == 1){
            tile = new TileZeroOneGenerator().generateTile();
        } else {
            tile = new TileOneOneGenerator().generateTile();
        }
        return tile;
    }

}
