package com.tu.bruno.serviceb;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tu.bruno.serviceb.model.RandomEntry;
import com.tu.bruno.serviceb.repository.RandomEntryRepository;

@SpringBootApplication(scanBasePackages = { "com.tu.bruno.serviceb", "com.tu.bruno.serviceb.model",
		"com.tu.bruno.serviceb.repository" })
public class ServiceBApplication {

	@Autowired
	RandomEntryRepository randomEntryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunnerBean() {
		return (args) -> {
			for (int i = 0; i < 1; i++) {
				randomEntryRepository.save(new RandomEntry(RandomStringUtils.random(15, true, true)));
			}
		};
	}

}
