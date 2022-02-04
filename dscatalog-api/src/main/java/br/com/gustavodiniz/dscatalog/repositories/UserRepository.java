package br.com.gustavodiniz.dscatalog.repositories;

import br.com.gustavodiniz.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
