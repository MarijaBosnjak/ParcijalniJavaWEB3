package com.example.ParcijalniJavaWEB3.service;


import com.example.ParcijalniJavaWEB3.domain.ProgramObrazovanja;

import java.util.List;

public interface ProgramObrazovanjaService {
    List<ProgramObrazovanja> findAll();
    ProgramObrazovanja findById(Long id);
    ProgramObrazovanja save(ProgramObrazovanja program);
    ProgramObrazovanja update(Long id, ProgramObrazovanja program);
    void delete(Long id);
}

