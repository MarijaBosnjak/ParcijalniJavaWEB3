package com.example.ParcijalniJavaWEB3.repository;

import com.example.ParcijalniJavaWEB3.domain.ProgramObrazovanja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProgramObrazovanjaJDBCRepositoryJava {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public ProgramObrazovanjaJDBCRepositoryJava(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;;
    }
public List<ProgramObrazovanja> findAll(){
        String sql ="select id, naziv, trajanjeUMjesecima from Program";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ProgramObrazovanja.class));
}

}
