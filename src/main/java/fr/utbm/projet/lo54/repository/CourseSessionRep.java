/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.repository;

import fr.utbm.projet.lo54.entity.CourseSession;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author loann
 */
@Repository
public interface CourseSessionRep extends CrudRepository<CourseSession, Long> {
    Optional<CourseSession> findById(long id);
}
