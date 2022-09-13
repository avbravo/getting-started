/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.model.Humanoide;
import org.acme.repository.HumanoideRepository;

/**
 *
 * @author avbravo
 */
@Path("/humanoide")
public class HumanoideController {
    @Inject
    HumanoideRepository humanoideRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Humanoide> findAll(){
        return humanoideRepository.findAll();
    }
    
}
