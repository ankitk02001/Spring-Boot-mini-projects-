package in.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
@Data
public class PassengerInfo {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	

}
