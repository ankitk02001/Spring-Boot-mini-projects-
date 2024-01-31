package in.ankit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ankit.entity.Player;


public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
