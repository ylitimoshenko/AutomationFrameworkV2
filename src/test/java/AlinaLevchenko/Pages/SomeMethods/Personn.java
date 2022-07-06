package AlinaLevchenko.Pages.SomeMethods;

public class Personn {
    private String name;

    public Personn(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "name='" + name + '\'' +
                '}';
    }
}

