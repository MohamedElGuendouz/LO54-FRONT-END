/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.servlet;

import fr.utbm.projet.lo54.entity.Client;
import fr.utbm.projet.lo54.entity.CourseSession;
import fr.utbm.projet.lo54.service.CourseSessionService;
import java.io.IOException;
import java.io.PrintWriter;
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
    
    /**
    @RequestMapping(value = { "/course" }, method = RequestMethod.POST)
    public String inscription(HttpServletRequest request , Model model) {
 
        String s_id = request.getParameter("id");
        
        if(s_id != null && !s_id.isEmpty()){
            Long id = Long.parseLong(s_id);
            CourseSession courseSession = css.findById(id);
            model.addAttribute("courseSession", courseSession);
            String lastname = request.getParameter("lastname");
            String firstname = request.getParameter("firstname");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");

            if(lastname != null && !lastname.isEmpty()){ 
                System.out.println("lastname OK");
                 if(firstname != null && !firstname.isEmpty()){ 
                     System.out.println("firstname OK");
                      if(address != null && !address.isEmpty()){ 
                            System.out.println("address OK");
                           if(phone != null && !phone.isEmpty()){ 
                                System.out.println("phone OK");
                                if(email != null && !email.isEmpty()){ 
                                    System.out.println("email OK");
                                    //Client c = new Client(request.getParameter("lastname"), request.getParameter("firstname"), request.getParameter("address"),request.getParameter("phone"), request.getParameter("email"), courseSession);
                                    //cs.registerClient(c);
                                }
                           }
                      }
                 }
            }
        }
        
        
        return "course";
    }*/
}
