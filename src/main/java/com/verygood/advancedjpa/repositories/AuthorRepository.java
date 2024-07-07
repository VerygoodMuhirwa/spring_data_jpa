package com.verygood.advancedjpa.repositories;

import com.verygood.advancedjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}

