package SpringSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringSecurity.Entity.User;
import SpringSecurity.Service.UserService;

@RestController
public class Controller {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser()
	{
		return this.userService.getUser();
	}
	@GetMapping("/user/{username}")
	public User getUserByIUser(@PathVariable("username") String username)
	{
		return this.userService.getUserById(username);
	}
	@PostMapping("/User")
	public User addUser(@RequestBody User user)
	{
		return this.userService.addUser(user);
	}
}
