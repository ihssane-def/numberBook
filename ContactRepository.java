package com.example.apisbackend.repository;


import com.example.apisbackend.beans.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findByName(String name);
}
