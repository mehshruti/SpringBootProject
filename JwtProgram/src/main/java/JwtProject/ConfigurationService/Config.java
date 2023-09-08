package JwtProject.ConfigurationService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class Config {
    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails user = User.builder().username("shruti").password(passwordEncoderParser().encode("shruti@1")).roles("ADMIN").build();
        UserDetails user1 = User.builder().username("raj").password(passwordEncoderParser().encode("raj34@1")).roles("NORMAL").build();
        return new InMemoryUserDetailsManager(user,user1);

    }
    @Bean
    public BCryptPasswordEncoder passwordEncoderParser()
    {
        return new BCryptPasswordEncoder();
    }
}
