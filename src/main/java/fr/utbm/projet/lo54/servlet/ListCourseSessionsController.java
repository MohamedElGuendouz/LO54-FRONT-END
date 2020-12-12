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
import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

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
    public String viewPersonList(HttpServletRequest request, Model model) {
 
        ArrayList<Location> listLocation = ls.listAllLocations();
        model.addAttribute("locations", listLocation);
        
        //long locationID = Long.parseLong(request.getParameter("locationID"));
        //int locationID = parseInt(request.getParameter("locationID"));
        int locationID = 1;
        Location loc = ls.findById(locationID);
        String keyword = "trod";
        ArrayList<CourseSession> listCourseSession = css.listAllCourseSession();
        //ArrayList<CourseSession> listCourseSession = css.listLocationCourseSession(loc);
        //ArrayList<CourseSession> listCourseSession = css.listKeywordCourseSession(keyword);
        model.addAttribute("courseSessions", listCourseSession);
 
        return "search-result";
    }
}
