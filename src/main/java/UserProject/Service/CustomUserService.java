package UserProject.Service;

import UserProject.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomUserService implements Userservice
{
    @Autowired
    UserREpository userRepository;
    @Override
    public List<User> getUser() {
        return this.userRepository.findAll();
    }

//    @Override
//    public Optional<User> getUserById(long UserId) {
//        return Optional.empty();
//    }

    //    @Override
//    public User getUserById(String userId) {
//        Optional<User> op = userRepository.findById(userId);
//
//        if (op.isPresent()) {
//            return op.get();
//        } else {
//            return null; // Or you can throw an exception or return a default user
//        }
//    }
@Override    
public Optional<User> getUserById(long userId) {
    return userRepository.findById(Long.valueOf(userId));
}


    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }
}
