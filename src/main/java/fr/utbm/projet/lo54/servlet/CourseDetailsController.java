/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.servlet;

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
public class CourseDetailsController {
    @Autowired
    private CourseSessionService css;
    
    @Autowired
    private ClientService cs;
    
    @RequestMapping(value = { "/courseDetails" }, method = RequestMethod.GET)
    //public String viewPersonList(@RequestParam long id, Model model) {
    public String viewPersonList(HttpServletRequest request , Model model) {
 
        long id = Long.parseLong(request.getParameter("id"));
        CourseSession courseSession = css.findById(id);
        if (courseSession == null){
            return "error";
        } else {
            model.addAttribute("courseSession", courseSession);
            model.addAttribute("numberRegistered", cs.numberOfRegistered(courseSession));

            return "course-details";
        }
    }
}
