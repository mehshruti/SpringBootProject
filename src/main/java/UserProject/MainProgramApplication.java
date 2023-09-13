package UserProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainProgramApplication {

	public static void main(String[] args)

	{
		SpringApplication.run(MainProgramApplication.class, args);
	}
//	@Bean
//	public void customize(ConfigurableEnvironment environment) {
//		// Set the property programmatically
//		environment.setRequiredProperties("spring.main.allow-bean-definition-overriding", "true");
//	}

}
