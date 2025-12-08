package events;

import methods.Operation;


public abstract class Ticket implements Operation {
    private String ticketCode;
    private String eventName;
    private String date;
    private String place;
    private int seatNumber;

    public Ticket(String ticketCode, String eventName, String date, String place, int seatNumber) {
        this.ticketCode = ticketCode;
        this.eventName = eventName;
        this.date = date;
        this.place = place;
        this.seatNumber = seatNumber;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void sellTicket() {
        System.out.println("Bliglietto " + getTicketCode() + " per " + getEventName() + " Venduto con sucesso");
    }

    @Override
    public String isSold(boolean sold) {
        if (sold) {
            return "Venduto";
        }
        else {
            return "Disponibile";
        }
    }
}
