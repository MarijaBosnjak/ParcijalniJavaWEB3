package com.example.ParcijalniJavaWEB3.controller;

import com.example.ParcijalniJavaWEB3.domain.ProgramObrazovanja;
import com.example.ParcijalniJavaWEB3.service.ProgramObrazovanjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programi")
public class ProgramObrazovanjaController {

    @Autowired
    private ProgramObrazovanjaService programService;

    @GetMapping
    public List<ProgramObrazovanja> getAllProgrami() {
        return programService.findAll();
    }

    @GetMapping("/{id}")
    public ProgramObrazovanja getProgramById(@PathVariable Long id) {
        return programService.findById(id);
    }

    @PostMapping
    public ProgramObrazovanja createProgram(@RequestBody ProgramObrazovanja program) {
        return programService.save(program);
    }

    @PutMapping("/{id}")
    public ProgramObrazovanja updateProgram(@PathVariable Long id, @RequestBody ProgramObrazovanja program) {
        return programService.update(id, program);
    }

    @DeleteMapping("/{id}")
    public void deleteProgram(@PathVariable Long id) {
        programService.delete(id);
    }
}