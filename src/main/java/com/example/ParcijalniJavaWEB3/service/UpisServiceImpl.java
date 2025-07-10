package com.example.ParcijalniJavaWEB3.service;

import com.example.ParcijalniJavaWEB3.domain.Upis;
import com.example.ParcijalniJavaWEB3.repository.UpisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpisServiceImpl implements UpisService {

    @Autowired
    private UpisRepository repository;

    @Override
    public List<Upis> findAll() {
        return repository.findAll();
    }

    @Override
    public Upis findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Upis nije pronađen s ID: " + id));
    }

    @Override
    public Upis save(Upis upis) {
        return repository.save(upis);
    }

    @Override
    public Upis update(Long id, Upis updated) {
        Upis existing = findById(id);
        existing.setPolaznik(updated.getPolaznik());
        existing.setProgram(updated.getProgram());
        existing.setDatumUpisa(updated.getDatumUpisa());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
