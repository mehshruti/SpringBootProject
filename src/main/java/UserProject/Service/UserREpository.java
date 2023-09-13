package UserProject.Service;

import UserProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserREpository extends JpaRepository<User,Long> {
}
