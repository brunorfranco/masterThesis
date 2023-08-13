package com.tu.bruno.serviceb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tu.bruno.serviceb.model.RandomEntry;
import com.tu.bruno.serviceb.repository.RandomEntryRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class RandomEntryController {

	@Autowired
	RandomEntryRepository randomEntryRepository;

	@GetMapping("/entries")
	public ResponseEntity<List<RandomEntry>> getAllEntries() {
		try {
			List<RandomEntry> entries = new ArrayList<RandomEntry>();

			randomEntryRepository.findAll().forEach(entries::add);
			if (entries.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(entries, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
