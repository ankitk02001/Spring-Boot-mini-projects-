package in.ankit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ADDRESS_TABLE")
public class Address {

	@Id
	@Column(name="ADDRESS_ID")
	private Integer addrId;
	private String city;
	private String state;
	private String country;
	
	@Column(name="EMPOLYEE_ID")
	private Integer empId;
}
