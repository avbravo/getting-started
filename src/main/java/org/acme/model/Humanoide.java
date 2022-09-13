/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.model;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Embedded;
import com.jmoordb.core.annotation.Entity;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.enumerations.JakartaSource;

/**
 *
 * @author avbravo
 */
@Entity(jakartaSource = JakartaSource.JAVAEE_LEGACY)
public class Humanoide {
 @Id
 private String idhumanoide;
 @Column 
 private String pieza;
// @Referenced(from = "persona", localField = "persona.idpersona", typeReferenced = TypeReferenced.EMBEDDED)
 @Embedded
 Persona persona;

    public Humanoide() {
    }

    public Humanoide(String idhumanoide, String pieza, Persona persona) {
        this.idhumanoide = idhumanoide;
        this.pieza = pieza;
        this.persona = persona;
    }

    public String getIdhumanoide() {
        return idhumanoide;
    }

    public void setIdhumanoide(String idhumanoide) {
        this.idhumanoide = idhumanoide;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
 
 
 
 
}
