package com.verygood.advancedjpa;

import com.verygood.advancedjpa.models.Author;
import com.verygood.advancedjpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdvancedJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedJpaApplication.class, args);
    }

  //  @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
        return args->{

            var author = Author
                    .builder()
                    .firstName("Verygood")
                    .lastName("Muhirwa")
                    .email("verygoodmuhirwa2@gmail.com")
                    .age(19)
                    .build();


            authorRepository.save(author);
        };
    }
}
