/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import fr.utbm.projet.lo54.repository.LocationRep;
import fr.utbm.projet.lo54.repository.LocationDao;
import fr.utbm.projet.lo54.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author loann
 */
public class LocationService {
    /*@Autowired
    private LocationRep locRep;*/
    
    public void registerLocation(Location loc){
        LocationDao ld = new LocationDao();
        
        ld.save(loc);
    }
    
    public void testFind(){
        LocationDao ld = new LocationDao();
        
        Location l = ld.getLocationById(2);
    }
}
