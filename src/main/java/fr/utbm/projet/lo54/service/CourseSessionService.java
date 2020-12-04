/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import java.util.ArrayList;

import fr.utbm.projet.lo54.repository.CourseSessionRep;
import fr.utbm.projet.lo54.repository.CourseSessionDao;
import fr.utbm.projet.lo54.entity.CourseSession;

import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author loann
 */
public class CourseSessionService {
    /*@Autowired
    private CourseSessionRep csp;*/
    
    public ArrayList<CourseSession> listAllCourseSession(){
        CourseSessionDao csd = new CourseSessionDao();
        ArrayList<CourseSession> acs = csd.listAll();
        
        /*ArrayList<CourseSession> acs = new ArrayList<>();
        Iterable<CourseSession> ics = csp.findAll();
        for (CourseSession cs : ics){
            acs.add(cs);
        }*/
        
        return acs;   
    }
    
    public CourseSession findById(long id) {
        CourseSessionDao csd = new CourseSessionDao();
        return csd.getCourseSessionById(id);
    }
}
