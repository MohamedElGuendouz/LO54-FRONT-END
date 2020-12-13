/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.service;

import fr.utbm.projet.lo54.repository.LocationRep;
import fr.utbm.projet.lo54.entity.Location;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author loann
 */
@Service
public class LocationService {
    @Autowired
    LocationRep locRep;
    
    public Location findById(long id){
        return locRep.findById(id).orElse(null);
    }
    
    public Location findByCity(String city){
        return locRep.findByCity(city).orElse(null);
    }
    
    public void registerLocation(Location loc){
        
        locRep.save(loc);
    }
    
    public ArrayList<Location> listAllLocations(){
        //LocationDao ld = new LocationDao();
        
        return (ArrayList<Location>) locRep.findAll();
        //return ld.listAll();
    }
}
