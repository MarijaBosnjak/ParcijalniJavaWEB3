package com.example.ParcijalniJavaWEB3.repository;

import com.example.ParcijalniJavaWEB3.domain.ProgramObrazovanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramObrazovanjaRepository extends JpaRepository<ProgramObrazovanja, Long> {
}
