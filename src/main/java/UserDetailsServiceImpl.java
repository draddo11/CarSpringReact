import com.nana.cardatabase.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements
        UserDetailsService{
    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername (String username)
        throws UsernameNotFoundException {
        Optional<User> user =
                repository.findByUsername(username);
        User.UserBuilder builder = null;
        if (user.isPresent()){
            User currentUser =user.get();
            builder=

        }
    }
}
