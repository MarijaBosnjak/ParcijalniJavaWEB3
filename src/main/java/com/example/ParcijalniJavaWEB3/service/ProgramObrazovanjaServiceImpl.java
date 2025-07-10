package com.example.ParcijalniJavaWEB3.service;

import com.example.ParcijalniJavaWEB3.domain.ProgramObrazovanja;
import com.example.ParcijalniJavaWEB3.repository.ProgramObrazovanjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramObrazovanjaServiceImpl implements ProgramObrazovanjaService {

    @Autowired
    private ProgramObrazovanjaRepository repository;

    @Override
    public List<ProgramObrazovanja> findAll() {
        return repository.findAll();
    }

    @Override
    public ProgramObrazovanja findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Program nije pronađen s ID: " + id));
    }

    @Override
    public ProgramObrazovanja save(ProgramObrazovanja program) {
        return repository.save(program);
    }

    @Override
    public ProgramObrazovanja update(Long id, ProgramObrazovanja updated) {
        ProgramObrazovanja existing = findById(id);
        existing.setNaziv(updated.getNaziv());
        existing.setTrajanjeUMjesecima(updated.getTrajanjeUMjesecima());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
