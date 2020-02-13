package my.projects.Keycloak;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* servizio che tramite una repository effettua il retrieve di tutti i Product */
@Component
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> getAllProducts() {
		return (List<Product>) repo.findAll();

	}

}
