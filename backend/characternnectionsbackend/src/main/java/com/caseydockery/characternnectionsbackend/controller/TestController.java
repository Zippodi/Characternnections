package com.caseydockery.characternnectionsbackend.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

import com.caseydockery.characternnectionsbackend.model.TestEntity;
import com.caseydockery.characternnectionsbackend.repository.TestEntityRepository;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final TestEntityRepository repository;

    @PostMapping
    public TestEntity create(@RequestBody TestEntity test) {
        return repository.save(test);
    }
    @PutMapping("/{id}")
    public TestEntity update(@PathVariable Long id, @RequestBody TestEntity updated) {
        TestEntity entity = repository.findById(id).orElseThrow();
        entity.setName(updated.getName());
        return repository.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping
    public List<TestEntity> getAll() {
        return repository.findAll();
    }
}