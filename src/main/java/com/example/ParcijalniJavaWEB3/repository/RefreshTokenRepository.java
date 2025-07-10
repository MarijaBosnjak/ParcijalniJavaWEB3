package com.example.ParcijalniJavaWEB3.repository;


import com.example.ParcijalniJavaWEB3.domain.Token;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends CrudRepository<Token, Integer> {
    Optional<Token> findByToken(String token);
}