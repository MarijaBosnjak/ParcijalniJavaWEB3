package com.example.ParcijalniJavaWEB3.service;



import com.example.ParcijalniJavaWEB3.domain.Polaznik;

import java.util.List;

public interface PolaznikService {
    List<Polaznik> findAll();
    Polaznik findById(Long id);
    Polaznik save(Polaznik polaznik);
    Polaznik update(Long id, Polaznik polaznik);
    void delete(Long id);
}
