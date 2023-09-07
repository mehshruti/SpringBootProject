package SpringSecurity.Service;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurity extends WebSecurityConfiguration{
//	@Override
//	protected void configure(HttpSecurity Http)throws Exception
//	{
//		Http.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.httpBasic();
//	}
	@Bean
//	@Order(SecurityProperties.BASIC_AUTH_ORDER)
		 public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
		 {
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin();
		http.httpBasic();
		return http.build();
	}
	

}
