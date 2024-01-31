package in.ankit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee_Table")
public class Employee {

	@Id
	@Column(name="EMPOLYEE_ID")
	private Integer empId;
	@Column(name="EMPLOYEE_NAME")
	private String empName;
	@Column(name="EMPLOYEE_SALARY")
	private Double empSalary;
}
