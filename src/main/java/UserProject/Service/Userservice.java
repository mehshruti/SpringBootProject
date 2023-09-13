package UserProject.Service;

import java.util.List;
import java.util.Optional;

import UserProject.Entity.User;

public interface Userservice
{
    //Get all User
    public List<User> getUser();
    //Get user by userId

    public User getUserById(String UserId);

    //Add new User
    public User addUser(User user);



}
