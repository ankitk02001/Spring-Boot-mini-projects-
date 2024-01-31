package in.ankit.binding;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book {

	private Integer id;
	private String name;
	private Double price;
	private Author author;
}
