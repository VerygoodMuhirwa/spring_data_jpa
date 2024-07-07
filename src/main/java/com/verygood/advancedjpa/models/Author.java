package com.verygood.advancedjpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
public class Author {
    @Id
    @SequenceGenerator(name = "author_seq", sequenceName = "author_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
