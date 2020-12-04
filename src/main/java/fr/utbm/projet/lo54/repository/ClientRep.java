/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author loann
 */
public interface ClientRep extends CrudRepository<Client, Long> {
    
}
