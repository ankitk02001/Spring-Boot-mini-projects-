package in.ankit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import in.ankit.binding.PassengerInfo;
import in.ankit.binding.TicketInfo;

@RestController
public class TicketController {

	@PostMapping(value="/ticket",produces = {"application/json"}, consumes = "application/json")
	public ResponseEntity<TicketInfo> getTicket(@RequestBody PassengerInfo pinfo){
		System.out.println(pinfo);
		TicketInfo ticketInfo=new TicketInfo();
		ticketInfo.setPnr(pinfo.getPhno());
		ticketInfo.setTicketId(2334);
		ticketInfo.setTicketStatus("COFIRMED");
		return new ResponseEntity<TicketInfo>(ticketInfo, HttpStatus.OK);
	}
	
	@PutMapping("ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo Info){
		System.out.println(Info);
		//logic to update record
		return new ResponseEntity<String>("Record Updated",HttpStatus.OK);
	}
	@DeleteMapping("/ticket/{id}")
	public ResponseEntity<String> deleteTicket(@PathVariable Integer id){
		System.out.println(id+" associated account deleted...");
		//logic to delete account
		return new ResponseEntity<String>("Account deleted ",HttpStatus.OK);
	}
	
}
