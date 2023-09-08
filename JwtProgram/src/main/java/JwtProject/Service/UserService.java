package JwtProject.Service;

import JwtProject.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.random.RandomGenerator;

@Service
public class UserService 
{

    private List<User> stored = new ArrayList<>();

    public UserService() {
        stored.add(new User(UUID.randomUUID().toString(),"shruti","shruti@gmail.com"));
        stored.add(new User(UUID.randomUUID().toString(),"neha","neha544gmail.com"));
        stored.add(new User(UUID.randomUUID().toString(),"priya","priya6543@gmail.com"));
    }
    public List<User> getUser()
    {
        return this.stored;
    }
}
