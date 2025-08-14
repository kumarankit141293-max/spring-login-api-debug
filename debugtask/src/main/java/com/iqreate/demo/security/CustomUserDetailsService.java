package com.iqreate.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.iqreate.demo.repository.UserRepository;

/*
* Replaced field injection with constructor injection for UserRepository.
Removed unnecessary @Autowired annotation.
*
*
* The main issue is the use of field injection (@Autowired on private UserRepository userRepository;).
* Constructor injection is preferred in Spring for better testability and immutability.
* Also, the @Autowired annotation is not needed if there is only one constructor.
*
* */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
            .map(user -> new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), new java.util.ArrayList<>()))
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}

