package my.projects.Keycloak;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Repository per effettuare operazioni di CRUD su oggetti di tipo Product
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
