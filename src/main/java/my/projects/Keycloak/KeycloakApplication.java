package my.projects.Keycloak;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(ProductRepository repo) {
		return (args) -> {
			repo.save(new Product("Ipad", "è un ipad"));
			repo.save(new Product("Iphone", "è un iphone"));
			repo.save(new Product("Macbook", "è un macbook"));
			repo.findAll().forEach(p -> System.out.println(p));
		};
	}

}
