package com.example.ParcijalniJavaWEB3.service;



import com.example.ParcijalniJavaWEB3.domain.Upis;

import java.util.List;

public interface UpisService {
    List<Upis> findAll();
    Upis findById(Long id);
    Upis save(Upis upis);
    Upis update(Long id, Upis upis);
    void delete(Long id);
}
