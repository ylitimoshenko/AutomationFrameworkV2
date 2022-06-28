package TsibatyukEvhenii.JustStuding;

import org.checkerframework.checker.units.qual.C;

public class Constructor {
    String model;
    int numModel;
    String owner;

    //object
    public Constructor(String model, int numModel, String owner) {
        this.model = model;
        this.numModel = numModel;
        this.owner = owner;
    }

    public Constructor(String model, int numModel) {
        this.model = model;
        this.numModel = numModel;
    }
    public Constructor(){

    }
    public static void call(String name){
        System.out.println(name+" call you");
    }


    public static void main(String[] args) {
        Constructor Phone1 = new Constructor("Sumsung", 121212, "Abdylah");

        Constructor.call("Artem ");
        System.out.println(Phone1.model+" "+Phone1.numModel);


    }
}



