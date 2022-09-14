/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.model;

import com.jmoordb.core.annotation.Entity;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.Referenced;
import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.enumerations.TypeReferenced;

/**
 *
 * @author avbravo
 */
@Entity(jakartaSource = JakartaSource.JAVAEE_LEGACY)
public class Habitante {
    @Id
    private String idhabitante;
   @Referenced(from = "persona", localField = "persona.idpersona",typeReferenced = TypeReferenced.EMBEDDED)
    Persona persona;

    public Habitante() {
    }

    public Habitante(String idhabitante, Persona persona) {
        this.idhabitante = idhabitante;
        this.persona = persona;
    }

    public String getIdhabitante() {
        return idhabitante;
    }

    public void setIdhabitante(String idhabitante) {
        this.idhabitante = idhabitante;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
   
    
}
