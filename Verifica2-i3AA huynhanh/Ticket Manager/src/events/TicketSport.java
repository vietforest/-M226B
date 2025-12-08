package events;



public class TicketSport extends Ticket {
    private String sector;

    public TicketSport(String ticketCode, String eventName, String date, String place, int seatNumber, String sector) {
        super(ticketCode, eventName, date, place, seatNumber);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public double calculateTicketPrice() {
        if (getSector().equals("curva")){
            return 20;
        }
        else if(getSector().equals("tribuna")){
            return 40;
        }
        return 0;
    }

    @Override
    public String getEventType() {
        return "SPORT";
    }

}
