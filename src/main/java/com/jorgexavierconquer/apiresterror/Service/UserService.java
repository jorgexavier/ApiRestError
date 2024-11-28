package com.jorgexavierconquer.apiresterror.Service;

import com.jorgexavierconquer.apiresterror.Model.User;
import com.jorgexavierconquer.apiresterror.Repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new EntityNotFoundException("Usuario não encontrado com ID: " + id));

    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
