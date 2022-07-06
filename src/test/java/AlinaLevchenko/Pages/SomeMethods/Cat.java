package AlinaLevchenko.Pages.SomeMethods;

import java.util.ArrayList;

public class Cat {
    public Cat(String name) {
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        int thomasIndex = cats.indexOf(thomas);
        System.out.println(thomasIndex);
    }
}


