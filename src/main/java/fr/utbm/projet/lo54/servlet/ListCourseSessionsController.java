/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.servlet;

import fr.utbm.projet.lo54.entity.CourseSession;
import fr.utbm.projet.lo54.entity.Location;
import fr.utbm.projet.lo54.service.CourseSessionService;
import fr.utbm.projet.lo54.service.LocationService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author loann
 */
@Controller
public class ListCourseSessionsController {
    @Autowired
    private LocationService ls;
    
    @Autowired
    private CourseSessionService css;
    
    @RequestMapping(value = { "/courseSessions" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
 
        ArrayList<Location> listLocation = ls.listAllLocations();
        model.addAttribute("locations", listLocation);
        
        ArrayList<CourseSession> listCourseSession = css.listAllCourseSession();
        model.addAttribute("courseSessions", listCourseSession);
 
        return "search-result";
    }
}
