package AlinaLevchenko.Pages.Incapsulatcia;

public class NewMethod {
    private int x, y;
    private boolean visibility;

    void createIncapsulyaciya(int a, int b){
        x = a; y = b;
        visibility = true;
    }
    void setVisibility(boolean visibility){
        this.visibility = visibility;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}

