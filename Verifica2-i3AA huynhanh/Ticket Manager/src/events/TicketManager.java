package events;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TicketManager {
    private List<Ticket> ticketsDisponible;
    private List<Ticket> ticketsSold;
    public TicketManager() {
        ticketsDisponible = new ArrayList<Ticket>();
        ticketsSold = new ArrayList<Ticket>();}
    public void addTicket(Ticket ticket) { ticketsDisponible.add(ticket);
        System.out.println("Aggiunto biglietto con codice " + ticket.getTicketCode()
                + " per evento " + ticket.getEventName());}
    public void printTickets(){
        for(Ticket ticket : ticketsDisponible){
            System.out.println("Codice: " + ticket.getTicketCode() + " | "
                    + "Evento: " + ticket.getEventName() + " | "
                    + "Data: " + ticket.getDate() + " | "
                    + "Luogo: " + ticket.getPlace() + " | "
                    + "Posto: " + ticket.getSeatNumber() + " | "
                    + "Prezzo: " + ticket.calculateTicketPrice() + " | "
                    + "Stato: " + ticket.isSold(false));
        }
        for(Ticket ticket : ticketsSold){
            System.out.println("Codice: " + ticket.getTicketCode() + " | "
                    + "Evento: " + ticket.getEventName() + " | "
                    + "Data: " + ticket.getDate() + " | "
                    + "Luogo: " + ticket.getPlace() + " | "
                    + "Posto: " + ticket.getSeatNumber() + " | "
                    + "Prezzo: " + ticket.calculateTicketPrice() + " | "
                    + "Stato:" + ticket.isSold(true));
        }
    }

    public void sellTicket(String eventName) {
        Ticket ticket = null;
        for(Ticket ticket2 : ticketsDisponible){
            if(ticket2.getEventName().equals(eventName)){
                ticket = ticket2;
                ticketsSold.add(ticket);
                ticketsDisponible.remove(ticket);
                ticket.sellTicket();
                break;
            }
            else {
                outOfTickets(eventName);
            }
        }

    }

    public void outOfTickets(String eventName){
        Ticket ticket;
        for(Ticket ticket2 : ticketsDisponible){
            if(!ticket2.getEventName().equals(eventName)){
                for (Ticket ticket3 : ticketsSold) {
                    if (ticket3.getEventName().equals(eventName)) {
                         ticket = ticket3;
                        System.out.println("Sono terminati i biglietti per " + ticket.getEventName());
                    }
                }
            }
        }
    }
    public void printTicketDisponible(){
        System.out.println("Numeri di biglietti disponibili: " + ticketsDisponible.size());
        ticketsDisponible.stream().filter(ticket -> ticket instanceof TicketConcert).map(ticket -> (TicketConcert) ticket)
                .forEach(ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Artista: " + ticket.getMainArtist() + " | " + " Settore: " + ticket .getSector()
                + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
        ticketsDisponible.stream().filter(ticket -> ticket instanceof TicketTheather).map(ticket -> (TicketTheather) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Spettacolo: " + ticket.getShowTitle()+ " | " + " Fila: " + ticket.getRow()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | ")
        );
        ticketsDisponible.stream().filter(ticket -> ticket instanceof TicketSport).map(ticket -> (TicketSport) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Evento " + ticket.getEventName() + " | " + " Settore: " + ticket.getSector()
                        + " | " + "posto: "  + ticket.getSeatNumber() + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | ")
        );
    }

    public void revenueMoney(){
        int somma = 0 ;
        for(Ticket ticket : ticketsSold){
            somma += ticket.calculateTicketPrice();
        }
        System.out.println("Incasso totale da biglietti venduti: " + somma);
    }

    public void searcEventTicket(String eventName){
        ticketsDisponible.stream().filter(ticket -> ticket instanceof TicketConcert).filter(ticket -> ticket.getEventName().equals(eventName)).map(ticket -> (TicketConcert) ticket)
                .forEach(ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Artista: " + ticket.getMainArtist() + " | " + " Settore: " + ticket .getSector()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
        ticketsDisponible.stream().filter(ticket -> ticket instanceof TicketTheather).filter(ticket -> ticket.getEventName().equals(eventName)).map(ticket -> (TicketTheather) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Spettacolo: " + ticket.getShowTitle()+ " | " + " Fila: " + ticket.getRow()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | ")
        );
        ticketsDisponible.stream().filter(ticket -> ticket instanceof TicketSport).filter(ticket -> ticket.getEventName().equals(eventName)).map(ticket -> (TicketSport) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Evento " + ticket.getEventName() + " | " + " Settore: " + ticket.getSector()
                        + " | " + "posto: "  + ticket.getSeatNumber() + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | ")
        );
        ticketsSold.stream().filter(ticket -> ticket instanceof TicketConcert).filter(ticket -> ticket.getEventName().equals(eventName)).map(ticket -> (TicketConcert) ticket)
                .forEach(ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Artista: " + ticket.getMainArtist() + " | " + " Settore: " + ticket .getSector()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
        ticketsSold.stream().filter(ticket -> ticket instanceof TicketTheather).filter(ticket -> ticket.getEventName().equals(eventName)).map(ticket -> (TicketTheather) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Spettacolo: " + ticket.getShowTitle()+ " | " + " Fila: " + ticket.getRow()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | ")
        );
        ticketsSold.stream().filter(ticket -> ticket instanceof TicketSport).filter(ticket -> ticket.getEventName().equals(eventName)).map(ticket -> (TicketSport) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Evento " + ticket.getEventName() + " | " + " Settore: " + ticket.getSector()
                        + " | " + "posto: "  + ticket.getSeatNumber() + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | ")
        );
    }

    public void orderTicket(){
        List<Ticket>tickets = new ArrayList<>();
        for(Ticket ticket : ticketsSold){
            tickets.add(ticket);
        }
        for(Ticket ticket : ticketsDisponible){
            tickets.add(ticket);
        }
        tickets.stream().sorted(Comparator.comparingDouble(Ticket::calculateTicketPrice)).filter(ticket -> ticket instanceof TicketConcert).map(ticket -> (TicketConcert) ticket)
                .forEach(ticket -> System.out.println( ticket.calculateTicketPrice()+" "+ ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Artista: " + ticket.getMainArtist() + " | " + " Settore: " + ticket .getSector()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));

        tickets.stream().sorted(Comparator.comparingDouble(Ticket::calculateTicketPrice)).filter(ticket -> ticket instanceof TicketTheather).map(ticket -> (TicketTheather) ticket).forEach(
                ticket -> System.out.println(ticket.calculateTicketPrice()+" "+ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Spettacolo: " + ticket.getShowTitle()+ " | " + " Fila: " + ticket.getRow()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));

        tickets.stream().sorted(Comparator.comparingDouble(Ticket::calculateTicketPrice)).filter(ticket -> ticket instanceof TicketSport).map(ticket -> (TicketSport) ticket).forEach(
                ticket -> System.out.println(ticket.calculateTicketPrice()+" "+ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Evento " + ticket.getEventName() + " | " + " Settore: " + ticket.getSector()
                        + " | " + "posto: "  + ticket.getSeatNumber() + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
    }
    public void searchTicketByEventType(String eventType){
        List<Ticket>tickets = new ArrayList<>();
        for(Ticket ticket : ticketsSold){
            tickets.add(ticket);
        }
        for(Ticket ticket : ticketsDisponible){
            tickets.add(ticket);
        }
        tickets.stream().filter(ticket -> ticket.getEventType().equals(eventType)).filter(ticket -> ticket instanceof TicketConcert).map(ticket -> (TicketConcert) ticket)
                .forEach(ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Artista: " + ticket.getMainArtist() + " | " + " Settore: " + ticket .getSector()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
        tickets.stream().filter(ticket -> ticket.getEventType().equals(eventType)).filter(ticket -> ticket instanceof TicketTheather).map(ticket -> (TicketTheather) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Spettacolo: " + ticket.getShowTitle()+ " | " + " Fila: " + ticket.getRow()
                        + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
        tickets.stream().filter(ticket -> ticket.getEventType().equals(eventType)).filter(ticket -> ticket instanceof TicketSport).map(ticket -> (TicketSport) ticket).forEach(
                ticket -> System.out.println(ticket.getEventType() + " - " + ticket.getEventName()
                        + " | " + " Evento " + ticket.getEventName() + " | " + " Settore: " + ticket.getSector()
                        + " | " + "posto: "  + ticket.getSeatNumber() + " | " + " Prezzo: " + ticket.calculateTicketPrice() + " | "));
    }

    public void averagePrice(){
        int somma = 0;
        List<Ticket>tickets = new ArrayList<>();
        tickets.addAll(ticketsSold);
        tickets.addAll(ticketsDisponible);
        for(Ticket ticket : tickets){
            somma += ticket.calculateTicketPrice();
        }
        System.out.println("Prezzo medio: " + somma/tickets.size());
    }
}
