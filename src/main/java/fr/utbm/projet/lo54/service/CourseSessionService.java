/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import java.util.ArrayList;

import fr.utbm.projet.lo54.repository.CourseSessionRep;
import fr.utbm.projet.lo54.entity.CourseSession;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author loann
 */
@Service
public class CourseSessionService {
    @Autowired
    private CourseSessionRep csp;
    
    public ArrayList<CourseSession> listAllCourseSession(){
        ArrayList<CourseSession> acs = (ArrayList<CourseSession>) csp.findAll();
                
        return acs;   
    }
    
    public Optional<CourseSession> findById(long id) {
        return csp.findById(id);
    }
}
