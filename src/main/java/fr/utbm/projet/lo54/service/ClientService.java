/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import fr.utbm.projet.lo54.repository.ClientRep;
import fr.utbm.projet.lo54.entity.Client;
import fr.utbm.projet.lo54.entity.CourseSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author loann
 */
@Service
public class ClientService {
    @Autowired
    ClientRep cr;
    
    public void registerClient(Client loc){
        cr.save(loc);
    }
    
    public int numberOfRegistered(CourseSession cs){
        return cr.countRegistrations(cs);
    }
}
