package in.ankit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="BANK_ACCOUNTS")
public class Account {

	@Column(name="BRANCH_NAME")
	private String branchName;
	@Column(name="MIN_BALANCE")
	private Double minBal;
	@EmbeddedId
	private AccountPk accpk;
	
}
