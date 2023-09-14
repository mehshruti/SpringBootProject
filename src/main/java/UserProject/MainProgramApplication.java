package UserProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

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
