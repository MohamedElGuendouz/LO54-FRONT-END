/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.Client;
import fr.utbm.projet.lo54.entity.CourseSession;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author loann
 */
@Repository
public interface ClientRep extends CrudRepository<Client, Long> {
    @Query("select count(c) FROM Client c INNER JOIN c.session cs  WHERE cs = ?1")
    public int countRegistrations(CourseSession cs);
}
