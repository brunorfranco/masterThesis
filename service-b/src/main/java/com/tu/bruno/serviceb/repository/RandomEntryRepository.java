package com.tu.bruno.serviceb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tu.bruno.serviceb.model.RandomEntry;

public interface RandomEntryRepository extends JpaRepository<RandomEntry, Long> {
}