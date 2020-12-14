package kz.iitu.ticketservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {

    private TicketRepository movieRepository;

    public Ticket addTicket(Ticket movie) {
        return movieRepository.save(movie);
    }

    public List<Ticket> searchTickets(String id) {
        return movieRepository.findTicketById(id);
    }


}
