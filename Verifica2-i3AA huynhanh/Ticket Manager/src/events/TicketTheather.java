package events;

public class TicketTheather extends Ticket {
    private String showTitle;
    private int row;
    private boolean studentDiscount;

    public TicketTheather(String ticketCode, String eventName, String date, String place, int seatNumber, String showTitle, int row, boolean studentDiscount) {
        super(ticketCode, eventName, date, place, seatNumber);
        this.showTitle = showTitle;
        this.row = row;
        this.studentDiscount = studentDiscount;
    }

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(boolean studentDiscount) {
        this.studentDiscount = studentDiscount;
    }


    @Override
    public double calculateTicketPrice() {
        if (studentDiscount) {
            return 30 - ((double) 30 /100*20);
        }
        else {
            return 30;
        }
    }

    @Override
    public String getEventType() {
        return "TEATRO ";
    }
}
