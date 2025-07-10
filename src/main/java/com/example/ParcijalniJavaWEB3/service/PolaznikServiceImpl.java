package com.example.ParcijalniJavaWEB3.service;

import com.example.ParcijalniJavaWEB3.domain.Polaznik;
import com.example.ParcijalniJavaWEB3.repository.PolaznikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolaznikServiceImpl implements PolaznikService {

    @Autowired
    private PolaznikRepository repository;

    @Override
    public List<Polaznik> findAll() {
        return repository.findAll();
    }

    @Override
    public Polaznik findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Polaznik nije pronađen s ID: " + id));
    }

    @Override
    public Polaznik save(Polaznik polaznik) {
        return repository.save(polaznik);
    }

    @Override
    public Polaznik update(Long id, Polaznik updated) {
        Polaznik existing = findById(id);
        existing.setIme(updated.getIme());
        existing.setPrezime(updated.getPrezime());
        existing.setEmail(updated.getEmail());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
