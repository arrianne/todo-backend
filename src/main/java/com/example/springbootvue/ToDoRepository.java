package com.example.springbootvue;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


    //All of the methods we’ll need for the REST API for our app will be automatically generated for us here.
    @RepositoryRestResource
    interface TodoRepository extends JpaRepository<Todo, Long> {}