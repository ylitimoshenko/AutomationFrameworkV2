package TsibatyukEvhenii.Tests;

public class Reader {
    String fullName, email;
    int telnumber, ticketnumber;
    static int totalBoocks;
    public void takeBoocks(int previousBoocks, int todayBoocks){
        totalBoocks = previousBoocks + todayBoocks;
        System.out.println("Student "+fullName+" allready take "+previousBoocks+" bocks. Boocks does he take today is "+todayBoocks);
        System.out.println("Student "+fullName+" has take "+totalBoocks+" boocks.");
        if (totalBoocks > 5){
            int count = totalBoocks - 5;
            int penalty = 50 * count;
            System.out.println("Allowed number boock to take is 5. Student "+ fullName+" has penalty for "+(totalBoocks - 5)+" boocks. The penalty for this will be "+penalty+"grn.\n");
        }
    }
    public void returnBoocks(int totalBoocks, int returnBoocks){
        System.out.println("Student "+fullName+" return "+returnBoocks+" boocks today.");
        if((totalBoocks - returnBoocks) > 0){
            System.out.println( "Quantity of boocks "+fullName+" still have is "+(totalBoocks - returnBoocks));
        }
        int count, penalty, futurePenalty;
        if(totalBoocks > 5){
            count = totalBoocks - 5;
            penalty = count * 50;
            System.out.println("Student "+fullName+" allready have penalty "+penalty+"grn., becouse has "+count+" boocks more than allowed." );
        }
        if((totalBoocks - returnBoocks) > 5){
            futurePenalty = ((totalBoocks - returnBoocks) - 5) * 50;
            System.out.println("After returning the boocks, the penalty will be "+futurePenalty+"grn.");
        }

    }

    public static void main(String[] args) {
        Reader reader1 = new Reader();
        reader1.fullName = "MrAnderson";
        reader1.ticketnumber = 101;
        reader1.telnumber = 1999;
        reader1.email = "i love the matrix@com";
        reader1.takeBoocks(4, 5);
        reader1.returnBoocks(totalBoocks,3);
    }
}
