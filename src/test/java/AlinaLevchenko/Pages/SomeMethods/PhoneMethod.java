package AlinaLevchenko.Pages.SomeMethods;
import java.util.ArrayList;

public class PhoneMethod {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();

        Phone nokia = new Phone("Picture");
        Phone samsung = new Phone("Telegram");
        Phone redmi = new Phone("SMS");
        Phone huawei = new Phone("Video");

        phones.add(nokia);
        phones.add(samsung);
        phones.add(redmi);
        phones.add(huawei);

        phones.remove(samsung);
        System.out.println(phones.contains(samsung));

    }
}

