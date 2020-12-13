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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
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
    public String viewList(HttpServletRequest request, Model model) throws ParseException {
 
        ArrayList<Location> listLocation = ls.listAllLocations();
        model.addAttribute("locations", listLocation);
        
        ArrayList<CourseSession> listCourseSession = new ArrayList<CourseSession>();
        boolean isEmpty = true;
        
        String text = request.getParameter("text");

        if(text != null && !text.isEmpty()){
            listCourseSession.addAll(css.listKeywordCourseSession(text));
            isEmpty = false;
        }
        
        
        String date = request.getParameter("date");
        Date date_temp=null;
        
        if(date != null && !date.isEmpty()){
            System.out.println(date);
            System.out.println(date);
            System.out.println(date);
            System.out.println(date);
            System.out.println(date);
            
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                    date_temp = (Date) formatter.parse(date);
                } catch (ParseException ex) {
            }
            listCourseSession.addAll(css.listAroundDateCourseSession(date_temp,2));
            isEmpty = false;
        }
        
        Location location = ls.findByCity(request.getParameter("location"));

        if(location != null){
            System.out.println(location.getCity());
            listCourseSession.addAll(css.listLocationCourseSession(location));
            isEmpty = false;
        } 
        if(isEmpty) {
            listCourseSession.addAll(css.listAllCourseSession());
        }
        model.addAttribute("courseSessions", listCourseSession.stream().distinct().collect(Collectors.toList()));
        
        
        return "index";
    }
}