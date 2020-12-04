/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import fr.utbm.projet.lo54.repository.ClientDao;
import fr.utbm.projet.lo54.entity.Client;
/**
 *
 * @author loann
 */
public class ClientService {
    
    public void registerClient(Client loc){
        ClientDao cd = new ClientDao();
        cd.save(loc);
    }
    
}
