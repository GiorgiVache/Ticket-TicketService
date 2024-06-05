// declare a class with data members
public class Ticket{
    String ID;
    String concertHall;
    int eventCode;
    long time;
    boolean promo;
    char stadiumSector;
    double maxBackpackWeight;

    // create constructors
    protected Ticket(String ID, String concertHall, int eventCode, long time, boolean promo, char stadiumSector,
                  double maxBackpackWeight){
        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.promo = promo;
        this.stadiumSector = stadiumSector;
        this.maxBackpackWeight = maxBackpackWeight;
    }

    protected Ticket(String concertHall, int eventCode, long time){
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
    }

    protected Ticket(){

    }
}