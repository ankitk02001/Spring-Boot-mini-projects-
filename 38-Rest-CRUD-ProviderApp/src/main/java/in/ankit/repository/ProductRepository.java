package in.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
