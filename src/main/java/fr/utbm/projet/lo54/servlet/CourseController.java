/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.servlet;

import fr.utbm.projet.lo54.entity.CourseSession;
import fr.utbm.projet.lo54.service.CourseSessionService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.utbm.projet.lo54.service.ClientService;
/**
 *
 * @author moham
 */
@Controller
public class CourseController {
    @Autowired
    private CourseSessionService css;
    
    @Autowired
    private ClientService cs;
    
    @RequestMapping(value = { "/course" }, method = RequestMethod.GET)
    public String viewDetailCourse(HttpServletRequest request , Model model) {
 
        String s_id = request.getParameter("id");
        
        if(s_id != null && !s_id.isEmpty()){
            Long id = Long.parseLong(s_id);
            CourseSession courseSession = css.findById(id);
            model.addAttribute("courseSession", courseSession);
            model.addAttribute("numberRegistered", cs.numberOfRegistered(courseSession));
        }
        return "course";
    }
}
