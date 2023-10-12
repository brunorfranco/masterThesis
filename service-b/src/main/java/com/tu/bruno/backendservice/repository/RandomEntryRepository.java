package com.tu.bruno.backendservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tu.bruno.backendservice.model.RandomEntry;

public interface RandomEntryRepository extends JpaRepository<RandomEntry, Long> {
}