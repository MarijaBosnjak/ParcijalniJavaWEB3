package com.example.ParcijalniJavaWEB3.repository;

import com.example.ParcijalniJavaWEB3.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
}