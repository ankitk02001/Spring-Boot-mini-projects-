package in.ankit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable {

	private Integer accountId;
	private String accType;
	private String holderName;
	
}
