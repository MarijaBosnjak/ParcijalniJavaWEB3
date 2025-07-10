package com.example.ParcijalniJavaWEB3.controller;

import com.example.ParcijalniJavaWEB3.domain.Polaznik;
import com.example.ParcijalniJavaWEB3.service.PolaznikService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polaznici")
public class PolaznikController {

    @Autowired
    private PolaznikService polaznikService;

    // GET /api/polaznici
    @GetMapping
    public List<Polaznik> getAll() {
        return polaznikService.findAll();
    }

    // GET /api/polaznici/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Polaznik> getById(@PathVariable Long id) {
        return ResponseEntity.ok(polaznikService.findById(id));
    }

    // POST /api/polaznici
    @PostMapping
    public ResponseEntity<Polaznik> create(@Valid @RequestBody Polaznik polaznik) {
        return ResponseEntity.ok(polaznikService.save(polaznik));
    }

    // PUT /api/polaznici/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Polaznik> update(@PathVariable Long id, @Valid @RequestBody Polaznik polaznik) {
        return ResponseEntity.ok(polaznikService.update(id, polaznik));
    }

    // DELETE /api/polaznici/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        polaznikService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

