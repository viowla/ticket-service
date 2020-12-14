package kz.iitu.ticketservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class TicketController {

    private TicketRepository ticketRepository;
    private TicketService ticketService;


    @GetMapping("/ticket/all")
    public ResponseEntity<List<Ticket>> getAllMovies(){
        return new ResponseEntity<>(ticketRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/ticket/{id}")
    public ResponseEntity<List<Ticket>> getMovie(@PathVariable String id) {
        return new ResponseEntity<>(ticketService.searchTickets(id), HttpStatus.OK);
    }

    @PostMapping("/ticket")
    public ResponseEntity<Ticket> createMovie(@RequestBody Ticket movie) {
        return new ResponseEntity<>(ticketService.addTicket(movie), HttpStatus.CREATED);
    }
}
