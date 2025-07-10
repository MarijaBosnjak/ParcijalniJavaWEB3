package com.example.ParcijalniJavaWEB3.repository;

import com.example.ParcijalniJavaWEB3.domain.Polaznik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolaznikJDBCRepositoryJava {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PolaznikJDBCRepositoryJava(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Polaznik> findAll() {
        String sql = "SELECT id, ime, prezime, email FROM polaznik";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Polaznik.class));
    }
}
