import java.io.Serializable;
import java.util.ArrayList;

public class Main implements Serializable {
    ArrayList<Sweet> gift;
    int totalWeight;

    public static void main(String[] args) {
        String pathForGift = "C:/Users/Andre/Desktop/gift.txt";
        String pathForCandy_Bunny = "C:/Users/Andre/Desktop/bunny.txt";
        String pathForCandy_Twix = "C:/Users/Andre/Desktop/twix.txt";
        String pathForCandy_Chamomile = "C:/Users/Andre/Desktop/chamomile.txt";

        Sweet candy_bunny = new Candy_Bunny();
        Sweet candy_chamomile = new Candy_Chamomile();
        Sweet candy_twix = new Candy_Twix();
        Main main = new Main();
        CandyFactory factory = new CandyFactory();
        Serializator serializator = new Serializator();
        /*serializator.serializate(candy_bunny, pathForCandy_Bunny);
        serializator.serializate(candy_chamomile, pathForCandy_Chamomile);
        serializator.serializate(candy_twix, pathForCandy_Twix);*/

        candy_bunny = (Candy_Bunny) serializator.deserializate(pathForCandy_Bunny);
        candy_twix = (Candy_Twix) serializator.deserializate(pathForCandy_Twix);
        candy_chamomile = (Candy_Chamomile) serializator.deserializate(pathForCandy_Chamomile);

        factory.makeGift(candy_twix, candy_chamomile, candy_bunny);
        factory.countWeightOfGift();
        factory.sortSweetsByWeight();
        main.gift = factory.getSweets();
        main.totalWeight = factory.getTotalWeight();
        //serializator.serializate(main, pathForGift);
        Main m = (Main) serializator.deserializate(pathForGift);
        System.out.println("Weight of gift = " + m.totalWeight + ", " + "Sweets in gift: "+ m.gift);

    }
}
