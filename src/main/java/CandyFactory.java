import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CandyFactory {

    ArrayList<Sweet> sweets = new ArrayList<Sweet>();
    int totalWeight;

    CandyFactory(){
        sweets = new ArrayList<Sweet>();
    }

    public ArrayList<Sweet> getSweets() {
        return sweets;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public Sweet getSweetByName(String name){
        if(name.equals("Twix"))
            return new Candy_Twix();
        if(name.equals("Chamomile"))
            return new Candy_Chamomile();
        if(name.equals("Bunny"))
            return new Candy_Bunny();
        throw new RuntimeException("No such candy on the factory");
    }

    public void makeGift(Sweet twix, Sweet bunny, Sweet chamomile){
        CandyFactory factory = new CandyFactory();
        twix = factory.getSweetByName("Twix");
        bunny = factory.getSweetByName("Bunny");
        chamomile = factory.getSweetByName("Chamomile");
        sweets.add(twix);
        sweets.add(bunny);
        sweets.add(chamomile);
       // System.out.println(sweets);
    }

    public void countWeightOfGift(){
        for (Sweet sweet: sweets){
            totalWeight += sweet.getWeight();
        }
       // System.out.println(totalWeight);
    }

    public void sortSweetsByWeight(){
        Collections.sort(sweets, new Comparator<Sweet>() {
            public int compare(Sweet o1, Sweet o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
    }


}
