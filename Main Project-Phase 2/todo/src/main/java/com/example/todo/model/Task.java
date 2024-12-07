package com.example.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tasks")
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    private String id;
    private String text;
    private boolean completed;
}
