/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.controller;

import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.model.Pais;
import org.acme.repository.PaisRepository;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

/**
 *
 * @author avbravo
 */
@Path("pais")
public class PaisController {
    @Inject
    PaisRepository paisRepository;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     @Operation(summary = "Get all conductor", description = "Returns all available items at the conductor")
    @APIResponse(responseCode = "500", description = "Server unavailable")
    @APIResponse(responseCode = "200", description = "The conductors")
    @Tag(name = "BETA", description = "This API is currently in beta state")
    @APIResponse(description = "The conductors", responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = Collection.class, readOnly = true, description = "the conductors", required = true, name = "conductors")))
    public List<Pais> findAll(){
        return paisRepository.findAll();
    }
    
}
