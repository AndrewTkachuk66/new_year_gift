import java.io.Serializable;

public class Candy_Bunny extends Sweet implements Serializable {
    String name = "Bunny";
    int weight = 40;

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
