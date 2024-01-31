package in.ankit.binding;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {
	
	private Integer orderId;
	private String orderBy;
	private String orderStatus;
	private Double billAmount;
	private Address address;

}
