package com.khalidApp.demo.service;

import com.khalidApp.demo.bean.Client;
import com.khalidApp.demo.dao.ClientDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class UserService {

    @Autowired
    ClientDao clientDao;

    public Client find(String Nom) {
        return clientDao.findByName(Nom);
    }

    public int Enregistrer(Client client) {
        if(client.getName() == null) {
            return -2;
        }else if(client.getSalary() == 0) {
            return -3;
        }else if(clientDao.findById(client.getId()).isPresent()) {
            return -4;
        }else {
            clientDao.save(client);
            return 0;
        }
    }

    @Transactional
    public int Supprimer(String nom) {
        if(clientDao.findByName(nom) == null) {
            return -1;
        }else {
            clientDao.deleteByName(nom);
            return 0;
        }
    }

    public List<Client> listSalaire(double montant) {
        return clientDao.findBySalaryLessThan(montant);
    }

}
