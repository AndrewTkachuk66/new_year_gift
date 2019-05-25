import java.io.Serializable;

public class Candy_Twix extends Sweet implements Serializable {
    String name = "Twix";
    int weight = 100;

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name ;
    }
}
