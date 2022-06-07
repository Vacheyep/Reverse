package am.reverse.repository;

import am.reverse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    boolean existsByEmail(String email);
    User findByEmail(String email);
    User findByName(String name);
}
