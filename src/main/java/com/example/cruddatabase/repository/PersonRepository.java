package com.example.cruddatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddatabase.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long>
{	 
}
