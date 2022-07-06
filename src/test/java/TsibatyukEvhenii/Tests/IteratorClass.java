package TsibatyukEvhenii.Tests;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<String> spusokArray = new ArrayList<>();
        spusokArray.add("Pershui");
        spusokArray.add("Drygui");
        spusokArray.add("Tretii");
        spusokArray.add("Chetvertui");
        spusokArray.add("Pyatui");
        spusokArray.add("Shostui");
        spusokArray.add("Syomuy");
        spusokArray.add("Vosmuy");




        Iterator<String> mozheiterator = spusokArray.iterator();
        while(mozheiterator.hasNext()) {

            mozheiterator.next();
            mozheiterator.remove();
        }
            System.out.println(spusokArray);


    }
}
