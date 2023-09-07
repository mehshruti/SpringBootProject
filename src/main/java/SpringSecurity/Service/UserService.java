package SpringSecurity.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import SpringSecurity.Entity.User;

@Service
public class UserService {
	
	public List<User> list=new ArrayList<>();

	public UserService() {
		list.add(new User("shrutik","23451ssd","sh13@gmail.com"));
		list.add(new User("priya","98436","priya234@gmail.com"));
	}

	//Fetch all ListItem
	public List<User> getUser()
	{
		return this.list;
	}
	//fetch single user in existing all User.
	public User getUserById(String username) {
		return this.list.stream().filter(user->user.getUsername().equals(username)).findAny().orElse(null);
	}
	//add user
	public User addUser(User user) {
		
		 this.list.add(user);
		 return user;
	}
}
