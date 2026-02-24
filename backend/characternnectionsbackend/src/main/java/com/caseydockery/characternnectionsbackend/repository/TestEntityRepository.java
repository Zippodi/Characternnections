package com.caseydockery.characternnectionsbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.caseydockery.characternnectionsbackend.model.TestEntity;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}
