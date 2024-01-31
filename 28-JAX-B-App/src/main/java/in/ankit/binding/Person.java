package in.ankit.binding;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	
	private Integer Id;
	
	private String name;
	private Integer age;
	@XmlElement(name="Phone_number")
	private Long phno;
	
    private Address address;
    @XmlAttribute
    private String type;

}