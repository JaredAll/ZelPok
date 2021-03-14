package Map;

import tile.Tile;

import java.util.ArrayList;
import java.util.List;

public class Map
{
    private final ArrayList<List<Tile>> map;

    public Map()
    {
        map = new ArrayList<>();
        populateMap(map);
    }

    public void populateMap(ArrayList<List<Tile>> map) {
        int mapSize = 2;
        TileGeneratorFactory tileGenerator = new TileGeneratorFactory();
        for(int i = 0; i < mapSize; i++)
        {
            List<Tile> row = new ArrayList<>();
            for(int j = 0; j < mapSize; j++)
            {
                row.add(tileGenerator.generateTile(i,j));
            }
            map.add(row);
        }
    }

}
