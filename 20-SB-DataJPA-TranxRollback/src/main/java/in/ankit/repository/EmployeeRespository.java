package in.ankit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Serializable> {

}
