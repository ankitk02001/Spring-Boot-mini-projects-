package in.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entity.Account;
import in.ankit.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk> {

}
