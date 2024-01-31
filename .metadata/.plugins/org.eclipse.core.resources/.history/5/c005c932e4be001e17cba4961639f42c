package in.ankit.converter;

import java.io.File;

import in.ankit.binding.Address;
import in.ankit.binding.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class ConvertJavaToXml {
 
	public static void main(String[] args) throws JAXBException {
		
		Address address=new Address();
		address.setCity("varanasi");
		address.setState("UttarPradesh");
		address.setCountry("India");
		
		Person person=new Person();
		person.setId(101);
		person.setName("Aditya");
		person.setAge(23);
		person.setPhno(3445566749l);
		person.setAddress(address);
		person.setType("Doctor");
		 // Marshalling (converting Java object to XML)
	    // Creating a JAXBContext instance for Person class
	    JAXBContext context = JAXBContext.newInstance(Person.class);
	    
	    // Creating a Marshaller object from the JAXBContext
	    Marshaller marshaller = context.createMarshaller();
	    
	    // Marshalling the Person object to XML and writing it to a file named "Person.xml"
	    marshaller.marshal(person, new File("Person.xml"));
	    System.out.println("Marshalling Completed");
	}
	
	
}