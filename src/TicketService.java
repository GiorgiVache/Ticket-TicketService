public class TicketService extends Ticket{
    public static void main(String[] args){
        // create empty ticket
        Ticket emptyTicket = new Ticket();
        System.out.println("Empty Ticket: " + "ID=" + emptyTicket.ID + ", concertHall=" + emptyTicket.concertHall
                + ", eventCode=" + emptyTicket.eventCode + ", time=" + emptyTicket.time
                + ", promo=" + emptyTicket.promo + ", stadiumSector=" + emptyTicket.stadiumSector +
                ", stadiumSector=" + emptyTicket.stadiumSector + ", maxBackpackWeight=" + emptyTicket.maxBackpackWeight);


        // create full ticket
        Ticket fullTicket = new Ticket("1A2D", "Tbilisi Concert Hall", 235, 1300000000,
                true, 'A', 20.203);
        System.out.println("Full Ticket: " + "ID=" + fullTicket.ID + ", concertHall=" + fullTicket.concertHall
                + ", eventCode=" + fullTicket.eventCode + ", time=" + fullTicket.time
                + ", promo=" + fullTicket.promo + ", stadiumSector=" + fullTicket.stadiumSector +
                ", stadiumSector=" + fullTicket.stadiumSector + ", maxBackpackWeight=" + fullTicket.maxBackpackWeight);


        // create limited ticket
        Ticket limitedTicket = new Ticket("Tbilisi Concert Hall", 235, 1300000000);
        System.out.println("Limited Ticket: " + "ID=" + limitedTicket.ID + ", concertHall=" + limitedTicket.concertHall
                + ", eventCode=" + limitedTicket.eventCode + ", time=" + limitedTicket.time
                + ", promo=" + limitedTicket.promo + ", stadiumSector=" + limitedTicket.stadiumSector +
                ", stadiumSector=" + limitedTicket.stadiumSector + ", maxBackpackWeight=" + limitedTicket.maxBackpackWeight);
    }
}
