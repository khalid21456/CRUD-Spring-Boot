package com.khalidApp.demo.dao;

import com.khalidApp.demo.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository; // Spring Data JPA
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings({"unused","unchecked"})
@Repository
public interface ClientDao extends JpaRepository<Client,Integer> {
    Client findByName(String nom);
    void deleteByName(String nom);
    List<Client> findBySalaryLessThan(double montant);
}
