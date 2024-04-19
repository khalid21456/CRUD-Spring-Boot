package com.khalidApp.demo.controller;

import com.khalidApp.demo.bean.Client;
import com.khalidApp.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("unused")
@RestController

public class ClientController {

    @Autowired
    UserService userService;

    @GetMapping("/sss")
    public String SayHello() {
        return "Hello world";
    }

    @GetMapping("/findClient/{nom}")
    public Client find(@PathVariable String nom) {
        return userService.find(nom);
    }

    @PostMapping("/save")
    public int Enregistrer(@RequestBody Client client) {
        return userService.Enregistrer(client);
    }

    @DeleteMapping("/del/{nom}")
    public int Supprimer(@PathVariable String nom) {
        return userService.Supprimer(nom);
    }

    @GetMapping("/findClientSalaire/{montant}")
    public List<Client> listSalaire(@PathVariable double montant) {
        return userService.listSalaire(montant);
    }

}
