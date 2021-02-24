package com.project.onlinebookstore.services;

import com.project.onlinebookstore.entity.Users;
import com.project.onlinebookstore.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class User_Security_Service implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Optional<Users> user=usersRepository.findByUsername(username);
            user.orElseThrow(() -> new UsernameNotFoundException("Could Not find user" + username));
            return user.map(User_Security_Details::new).get();
    }
}
