/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.CourseSession;
import fr.utbm.projet.lo54.entity.Location;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author loann
 */
@Repository
public interface CourseSessionRep extends JpaRepository<CourseSession, Long> {
    Logger logger = LoggerFactory.getLogger(CourseSessionRep.class);
    
    Optional<CourseSession> findById(long id);
    
    @Query("SELECT c FROM CourseSession c INNER JOIN Location l ON c.id = l.id WHERE l.city LIKE :city")
    List<CourseSession> findAllByLocation(@Param("city") String l);
    
    //@Query(value="select cs from COURSE_SESSION cs where startDate = :dd")
    //List<CourseSession> findAroundStartDate(@Param("dd") Date dd);
    List<CourseSession> findAllByStartDateBetween(Date dateDebut, Date DateFin);
    
    //@Query(value="select cs from CourseSession cs", nativeQuery = false)
    @Query("select c from CourseSession c INNER JOIN c.course o WHERE LOWER(o.code) LIKE %?1% OR LOWER(o.title) LIKE %?1%")
    public List<CourseSession> search(String keyword);
    
    

}
