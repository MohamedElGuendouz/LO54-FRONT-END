/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.servlet;

import fr.utbm.projet.lo54.entity.Location;
import fr.utbm.projet.lo54.service.LocationService;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author loann
 */
@Controller
public class ListLocationsController {
    
    @RequestMapping(value = { "/listLocations" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
 
        LocationService ls = new LocationService();
        ArrayList<Location> listLocation = ls.listAllLocations();
        model.addAttribute("locations", listLocation);
        
 
        return "listLocation";
    }
}
