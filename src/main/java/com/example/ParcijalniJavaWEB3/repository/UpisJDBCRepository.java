package com.example.ParcijalniJavaWEB3.repository;

import com.example.ParcijalniJavaWEB3.domain.Upis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UpisJDBCRepository {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public UpisJDBCRepository (JdbcTemplate jdbcTemplate){
this.jdbcTemplate=jdbcTemplate;
    }
    public List<Upis> findAll(){
        String sql = "SELECT id, polaznik_id, program_id, datum_upisa FROM upis";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Upis.class));
    }
}
