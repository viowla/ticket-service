package kz.iitu.ticketservice;

import java.util.List;

public class UserTicket {
    private List<Ticket> userTickets;

    public UserTicket() {
    }

    public UserTicket(List<Ticket> userTickets) {
        this.userTickets = userTickets;
    }
}
