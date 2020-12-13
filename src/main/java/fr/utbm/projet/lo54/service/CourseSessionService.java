/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import java.util.ArrayList;

import fr.utbm.projet.lo54.repository.CourseSessionRep;
import fr.utbm.projet.lo54.entity.CourseSession;
import fr.utbm.projet.lo54.entity.Location;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    
    public ArrayList<CourseSession> listKeywordCourseSession(String keyword){
        ArrayList<CourseSession> acs = (ArrayList<CourseSession>) csp.search(keyword.toLowerCase());
                
        return acs;   
    }
    
    public ArrayList<CourseSession> listLocationCourseSession(Location l){
        System.out.println(l);
        ArrayList<CourseSession> acs = (ArrayList<CourseSession>) csp.findAllByLocation(l);
                
        return acs;   
    }
    
    //return list of CourseSession where startDate is between the date d - nb days and d + nb days
    public ArrayList<CourseSession> listAroundDateCourseSession(Date d, int nb){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        
        System.out.println(""+d);
        calendar.add(Calendar.DATE, -nb);
        Date dd = calendar.getTime();
        
        calendar.add(Calendar.DATE, +nb*2);
        Date df = calendar.getTime();
        
        System.out.println(""+formatter.format(dd).toString());
        System.out.println(""+formatter.format(df).toString());
        
        ArrayList<CourseSession> acs = (ArrayList<CourseSession>) csp.findAllByStartDateBetween(dd,df);
                
        return acs;   
    }
    
    public CourseSession findById(long id) {
        return csp.findById(id).orElse(null);
    }
}
