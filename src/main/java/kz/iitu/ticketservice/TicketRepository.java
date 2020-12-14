package kz.iitu.ticketservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository  extends JpaRepository<Ticket, String> {

    List<Ticket> findTicketById(String id);

}
