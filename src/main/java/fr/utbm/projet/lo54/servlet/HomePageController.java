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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author moham
 */
@Controller
public class HomePageController {
    @Autowired
    private LocationService ls;
    
    @Autowired
    private CourseSessionService css;
 
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String viewList(HttpServletRequest request, Model model) {
 
        ArrayList<Location> listLocation = ls.listAllLocations();
        model.addAttribute("locations", listLocation);
        
        int locationID = 1;
        Location loc = ls.findById(locationID);
        String keyword = "trod";
        ArrayList<CourseSession> listCourseSession = css.listAllCourseSession();
        model.addAttribute("courseSessions", listCourseSession);
 
        return "index";
    }
}
