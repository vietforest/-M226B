package events;



public class TicketConcert extends Ticket{
    private String sector;
    private String mainArtist;

    public TicketConcert(String ticketCode, String eventName, String date, String place, int seatNumber, String sector, String mainArtist) {
        super(ticketCode, eventName, date, place, seatNumber);
        this.sector = sector;
        this.mainArtist = mainArtist;
    }

    public String getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(String mainArtist) {
        this.mainArtist = mainArtist;
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
        return "CONCERTO";
    }

}
