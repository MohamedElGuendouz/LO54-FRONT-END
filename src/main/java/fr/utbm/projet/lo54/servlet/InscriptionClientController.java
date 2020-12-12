/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.servlet;

import fr.utbm.projet.lo54.entity.Client;
import fr.utbm.projet.lo54.entity.CourseSession;
import fr.utbm.projet.lo54.service.ClientService;
import fr.utbm.projet.lo54.service.CourseSessionService;

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
public class InscriptionClientController {
    @Autowired
    private ClientService cs;
    
    @Autowired
    private CourseSessionService css;
    
    @RequestMapping(value = { "/inscriptionClient" }, method = RequestMethod.POST)
    public String viewPersonList(HttpServletRequest request, Model model) {
        long valueCs = Long.parseLong(request.getParameter("courseSession"));
        CourseSession courseS = css.findById(valueCs);
        
        Client ct = new Client(request.getParameter("lastname"), request.getParameter("firstname"),request.getParameter("address"),request.getParameter("phone"),request.getParameter("email"), courseS);
        cs.registerClient(ct);
 
        return "successfulRegis";
    }
}
