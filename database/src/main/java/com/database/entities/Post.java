package com.database.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    // Constructors
    public Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
