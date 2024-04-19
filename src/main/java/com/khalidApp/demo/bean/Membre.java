package com.khalidApp.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
@SuppressWarnings("unused")
public class Membre extends Person{

    public Membre(String nom, String prenom, String address) {
        this.nom = nom;this.prenom = prenom; this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

}
