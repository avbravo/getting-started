/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.controller;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.model.Persona;
import org.acme.repository.PersonaRepository;

/**
 *
 * @author avbravo
 */
@Path("/persona")
public class PersonaController {
    @Inject
    PersonaRepository personaRepository;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> findAll(){
        return personaRepository.findAll();
    }
    
    @GET
    @Path("{idpersona}")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona queryByIdpersona(@PathParam("idpersona") String idpersona){
        return personaRepository.queryByIdpersona(idpersona).get();
    }
    
    @GET
    @Path("/find/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona findByNombre(@PathParam("nombre") String nombre){
        return personaRepository.findByNombre(nombre).get();
    }
}
