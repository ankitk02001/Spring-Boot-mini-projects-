package in.ankit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.Address;

public interface AddressRepositroy extends JpaRepository<Address, Serializable> {

}