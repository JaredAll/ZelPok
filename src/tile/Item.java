package tile;

import java.util.Objects;

public class Item
{
    public enum Type{
        PickUp,
        Static,
        Interactive
    }

    public String name;
    public String description;
    public Type type;

    public Item (String name, String description, Type type){
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public void description(){
        System.out.println(this.description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(description, item.description) &&
                type == item.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type);
    }
}
