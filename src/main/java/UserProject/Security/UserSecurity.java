package UserProject.Security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class UserSecurity extends WebSecurityConfiguration {

	 


	    @Bean
//	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    	public UserDetailsService userDetailsService()
	    	{
	    	 UserDetails user = User.withUsername("Shruti")
	    	            .password(passwordEncoder().encode("Shruti121"))
	    	            .roles("USER")
	    	            .build();
	    	 return new InMemoryUserDetailsManager(user);

				/*
				 * return http. csrf(csrf->csrf.disable()) .cors(cors->cors.disable())
				 * .authorizeHttpRequests(auth->auth. requestMatchers("/auth/register",
				 * "/auth/token", "/auth/validate")
				 * 
				 * .permitAll()) .build();
				 */}

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	 

	    @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception 
	    {
	        return config.getAuthenticationManager();
	    }
	}