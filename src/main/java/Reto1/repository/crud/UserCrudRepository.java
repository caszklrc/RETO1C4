package Reto1.repository.crud;

import Reto1.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CarlosSacristan
 */
public interface UserCrudRepository extends CrudRepository<User,Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
