package Player;

import tile.Item;
import java.util.ArrayList;
import java.util.List;

public class UserInventory {
    List<Item> inventory;

    public UserInventory(){
        this.inventory = new ArrayList<Item>();
    }

    public void add(Item itemToBeAdded){
        if(itemToBeAdded.type != Item.Type.PickUp){
            System.out.println("You can't pick that up!");
        }else{
            inventory.add(itemToBeAdded);
            System.out.println(itemToBeAdded.name + " has been added to your inventory!");
        }
    }

    public void remove(Item itemToBeRemoved){
                inventory.remove(itemToBeRemoved);
        }

}
