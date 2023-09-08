package JwtProject.Controller;

import JwtProject.Entity.User;
import JwtProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/Admin")
public class ControllerService {

    @Autowired
    private UserService userService;
    @GetMapping("Users")
    public List<User> getUsers()
    {
        return this.userService.getUser();
    }

    //to get Current User-name
    @GetMapping("/Username")
    public  String Usernames(Principal principal)
    {
        return principal.getName();
    }
}
