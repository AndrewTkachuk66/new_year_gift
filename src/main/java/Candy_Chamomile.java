import java.io.Serializable;

class Candy_Chamomile extends Sweet implements Serializable{
    String name = "Chamomile";
    int weight = 32;

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name ;
    }
}

