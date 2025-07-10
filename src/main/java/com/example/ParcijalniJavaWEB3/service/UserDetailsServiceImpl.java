package com.example.ParcijalniJavaWEB3.service;

import com.example.ParcijalniJavaWEB3.domain.CustomUserDetails;
import com.example.ParcijalniJavaWEB3.domain.UserInfo;
import com.example.ParcijalniJavaWEB3.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug("Entering in loadUserByUsername Method...");

        UserInfo user = userRepository.findByUsername(username);

        if (user == null) {
            log.error("Username not found: " + username);
            throw new UsernameNotFoundException("Could not find user: " + username);
        }

        log.info("User Authenticated Successfully..!!!");
        return new CustomUserDetails(user);
    }


}
