package com.example.ParcijalniJavaWEB3.controller;

import com.example.ParcijalniJavaWEB3.domain.Upis;
import com.example.ParcijalniJavaWEB3.service.UpisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/upisi")
public class UpisController {

    @Autowired
    private UpisService upisService;

    @GetMapping
    public List<Upis> getAllUpisi() {
        return upisService.findAll();
    }

    @GetMapping("/{id}")
    public Upis getUpisById(@PathVariable Long id) {
        return upisService.findById(id);
    }

    @PostMapping
    public Upis createUpis(@RequestBody Upis upis) {
        return upisService.save(upis);
    }

    @PutMapping("/{id}")
    public Upis updateUpis(@PathVariable Long id, @RequestBody Upis upis) {
        return upisService.update(id, upis);
    }

    @DeleteMapping("/{id}")
    public void deleteUpis(@PathVariable Long id) {
        upisService.delete(id);
    }
}