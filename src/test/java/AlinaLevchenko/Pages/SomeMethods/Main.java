package AlinaLevchenko.Pages.SomeMethods;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Personn> list = new ArrayList<>();
        Personn personn1 = new Personn("White");
        Personn personn2 = new Personn("Rabbit");
        list.add(personn1);
        list.add(personn2);

        Personn personn1FromCollection = list.get(0);
        Personn personn2FromCollection = list.get(1);

        System.out.println(personn1FromCollection);
        System.out.println(personn2FromCollection);
    }
}

