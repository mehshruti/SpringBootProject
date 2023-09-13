package UserProject.Controller;

import UserProject.Entity.User;
import UserProject.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/start/")
public class UserController
{
    @Autowired
    Userservice userservice;
    @GetMapping("User")
    public List<User> showUser(){
        return this.userservice.getUser();
    }
    @GetMapping("{UserId}")
    public Optional<User> getUSerId(@PathVariable("UserId") long UserId)
    {
        return this.userservice.getUserById(UserId);
    }
    @PostMapping("User")
    public  String addUser(@RequestBody User user)
    {
        this.userservice.addUser(user);
        return "User Created Successfully!";
    }

}
