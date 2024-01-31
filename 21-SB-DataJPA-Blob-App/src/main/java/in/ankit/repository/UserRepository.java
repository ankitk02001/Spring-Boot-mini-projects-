package in.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
