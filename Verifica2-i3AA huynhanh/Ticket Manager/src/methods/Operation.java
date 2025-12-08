package methods;

public interface Operation {
    double calculateTicketPrice();
    void sellTicket();
    String getEventType();
    String isSold(boolean sold);
}
