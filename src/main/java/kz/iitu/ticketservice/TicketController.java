package kz.iitu.ticketservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @GetMapping("/{userId}")
    public UserTicket getTicketsByUserId(@PathVariable("userId") String userId){
        List<Ticket> userTicketList =  Arrays.asList(
                new Ticket("1", 10.0),
                new Ticket("2", 15.0));

        UserTicket userTicket = new UserTicket(userTicketList);

        return userTicket;
    }

    @GetMapping("")
    public List<Ticket> getAllTickets(){
        List<Ticket> tickets = Arrays.asList(
                new Ticket("1",12.0),
                new Ticket("2",10.0),
                new Ticket("3",15.0),
                new Ticket("4",12.0),
                new Ticket("5",10.0),
                new Ticket("6",15.0)
        );
        return tickets;
    }
}
