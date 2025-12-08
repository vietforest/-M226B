import events.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//huynh anh nguyen i3aa
public class Main {
    public static void main(String[] args) {
        Ticket ticket = new TicketConcert("C001", "Rock Festival 2025", "15/06/2025", "Parco Eventi", 101, "tribuna", "BlackPink");
        Ticket ticket2 = new TicketConcert("C002", "Rock Festival 2025", "18/06/2025", "Arena concerti", 201, "curva", "BlackPink");
        Ticket ticket3 = new TicketConcert("C003", "Jazz night", "20/7/2025", "Arena concerti", 50, "tribuna", "BlackPink");
        Ticket ticket4 = new TicketTheather("T001", "Serate alla scala", "10/08/2025", "Teatro alla scala", 15, "la Traviata", 8 , false);
        Ticket ticket5 = new TicketTheather("T002", "Serate alla scala", "10/08/2025", "Teatro alla scala", 25, "Amleto", 12 , true);
        Ticket ticket6 = new TicketTheather("T003", "Riscopriamo il teatro", "05/09/2025 ", "Teatro comunale ", 40, "Amleto", 8 , true);
        Ticket ticket7 = new TicketTheather("T004", "Riscopriamo il teatro", "05/09/2025 ", "Teatro comunale ", 41, "Amleto", 12 , false);
        Ticket ticket8 = new TicketSport("S001", "Serie A - Inter vs Milan", "15/10/2025", "Stadio San Siro ", 150, "tribuna");
        Ticket ticket9 = new TicketSport("S002", "Serie A - Inter vs Milan", "15/10/2025", "Stadio San Siro ", 250, "curva");
        Ticket ticket10 = new TicketSport("S003", "NBA Finals", "15/10/2025", "Madison Square Garden", 75, "tribuna");
        TicketManager tm = new TicketManager();
        System.out.println("--- TEST 1: Aggiunta di 10 biglietti al sistema ---");
        tm.addTicket(ticket);
        tm.addTicket(ticket2);
        tm.addTicket(ticket3);
        tm.addTicket(ticket4);
        tm.addTicket(ticket5);
        tm.addTicket(ticket6);
        tm.addTicket(ticket7);
        tm.addTicket(ticket8);
        tm.addTicket(ticket9);
        tm.addTicket(ticket10);
        System.out.println("\n--- TEST 2: Stampa di tutti i biglietti ---");
        tm.printTickets();
        System.out.println("\n--- TEST 3: Vendita di 5 biglietti ---");
        tm.sellTicket("Jazz night");
        tm.sellTicket("Serate alla scala");
        tm.sellTicket("Rock Festival 2025");
        tm.sellTicket("Serie A - Inter vs Milan");
        tm.sellTicket("NBA Finals");

        System.out.println("\n--- TEST 4: NBA Finals - Biglietti terminati ---");
        tm.outOfTickets("NBA Finals");
        System.out.println("\n--- TEST 5: Lista dei biglietti ancora disponibili ---");
        tm.printTicketDisponible();
        System.out.println("\n--- TEST 6: Calcolo incasso totale ---");
        tm.revenueMoney();
        System.out.println("\n--- TEST 7: Biglietti per 'Rock Festival 2025' ---");
        tm.searcEventTicket("Rock Festival 2025");
        System.out.println("\n--- TEST 8: Biglietti ordinati per prezzo crescente ---");
        tm.orderTicket();
        System.out.println("\n--- TEST 9a: Tutti i biglietti per concerti ---");
        tm.searchTicketByEventType("CONCERTO");
        System.out.println("\n" +
                "--- TEST 9b: Tutti i biglietti sportivi ---");
        tm.searchTicketByEventType("SPORT");
        System.out.println("\n--- TEST 10: Prezzo medio di tutti i biglietti ---");
        tm.averagePrice();

    }


}



/*
    double calculateTicketPrice(); polimorfismo
    void sellTicket(); heritage
    String getEventType(); polimorfismo
    String isSold(boolean sold); heritage
* */