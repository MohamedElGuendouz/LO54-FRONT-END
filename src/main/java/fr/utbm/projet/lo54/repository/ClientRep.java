/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.Client;
import fr.utbm.projet.lo54.entity.CourseSession;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author loann
 */
@Repository
public interface ClientRep extends CrudRepository<Client, Long> {

    /**
     * 
     * Merci Spring Data
     * 
     * @Query("SELECT MAX(c.id) FROM Client c")
    Integer findMaxId();
    
    @Modifying
    @Query(
      value = 
        "insert into Users (id, address, email, firstname, lastname, phone, session) values (:id, :address, :email, :firstname, :lastname, :phone, :session)",
      nativeQuery = true)
    void insertUser(@Param("id") Integer id, @Param("address") String adresse, 
      @Param("email") String email, @Param("firstname") String firstname,
      @Param("lastname") String lastname, @Param("phone") String phone, @Param("session") Integer session);
    */
    
    
    @Query("select count(c) FROM Client c INNER JOIN c.session cs WHERE cs = ?1")
    public int countRegistrations(CourseSession cs);
}
