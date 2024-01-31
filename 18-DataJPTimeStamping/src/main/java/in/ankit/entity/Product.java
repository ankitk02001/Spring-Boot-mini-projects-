package in.ankit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Product_Table")
public class Product {

	@Id
	@Column(name="PRODUCT_ID")
	private Integer pid;
	@Column(name="PRODUCT_NAME")
	private String pname;
	@Column(name="PRODUCT_PRICE")
	private Double price;
	
	@Column(name="CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
}
