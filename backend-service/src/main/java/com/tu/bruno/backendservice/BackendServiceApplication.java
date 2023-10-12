package com.tu.bruno.backendservice;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tu.bruno.backendservice.model.RandomEntry;
import com.tu.bruno.backendservice.repository.RandomEntryRepository;

@SpringBootApplication(scanBasePackages = { "com.tu.bruno.backendservice", "com.tu.bruno.backendservice.model",
		"com.tu.bruno.backendservice.repository" })
public class BackendServiceApplication {

	@Autowired
	RandomEntryRepository randomEntryRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunnerBean() {
		return (args) -> {
			for (int i = 0; i < 10; i++) {
				randomEntryRepository.save(new RandomEntry(RandomStringUtils.random(15, true, true)));
			}
		};
	}

}
