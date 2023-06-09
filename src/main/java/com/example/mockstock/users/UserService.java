package com.example.mockstock.users;

import com.example.mockstock.portfolios.Portfolios;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;
    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }
    public User getUserByID(Long id) { return userRepository.findById(id).orElse(null); }
    public User createNewUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            userRepository.delete(user.get());
        } else {
            throw new UserNotFound();
        }
    }
    public User updateUser(Double balance, Long id) {
        Optional<User> update = userRepository.findById(id);
        if (update.isPresent()) {
            update.get().setBalance(balance);
            return userRepository.save(update.get());
        }
        return null;
    }
}
