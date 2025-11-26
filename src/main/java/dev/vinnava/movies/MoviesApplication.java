package dev.vinnava.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {

        Dotenv dotenv = Dotenv.load(); // Loads .env from the current directory
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(MoviesApplication.class, args);
	}

}
