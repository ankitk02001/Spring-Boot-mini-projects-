package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.PassengerInfo;
import in.ashokit.response.TicketInfo;
import io.swagger.annotations.Api;

@RestController
@Api("THIS IS DOCUMANTATION FOR AIR INDIA")
public class AirIndiaRestController {
	
	
	@PostMapping(value="/bookFlightTicket",
			    consumes = { "application/json","application/xml"},
			    produces = { "application/json","application/xml"}
			     )
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		
		//logic to book ticket
		TicketInfo ticket=new TicketInfo();
		ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTicketPrice("4500.00INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
		
		
	}

}
