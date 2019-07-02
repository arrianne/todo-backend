package com.example.springbootvue;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

// defining a data model with three properties
// This class will be mapped to a database table in an in-memory H2 database
// each property in the class will become a table column. You get the in-memory database by default with the included dependency: H2.

    @Entity
    @Data
    @NoArgsConstructor
    public class Todo {
        @Id @GeneratedValue
        private Long id;
        @NonNull
        private String title;
        private Boolean completed = false;
    }