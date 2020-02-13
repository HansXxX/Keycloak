package my.projects.Keycloak;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/* Controller di Spring MVC.
 * Definisce due mapping per le get: uno per la pagina di visualizzazione prodotti (/products)
 * e uno per l'azione di logout, che redirige alla index
 * 
 */
@Controller
public class ProductController {

	// servizio che tramite una Repository effettua il retrieve di tutti i Product
	@Autowired
	private ProductService service;

	// retrieve di tutti i Product tramite il servizio e li aggiunge al model
	@GetMapping(path = "/products")
	public String getProducts(Model model) {
		model.addAttribute("products", service.getAllProducts());
		return "products";
	}

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";

	}

}
