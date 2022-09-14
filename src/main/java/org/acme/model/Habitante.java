/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.model;

import com.jmoordb.core.annotation.Embedded;
import com.jmoordb.core.annotation.Entity;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.enumerations.JakartaSource;
import java.util.stream.Stream;

/**
 *
 * @author avbravo
 */
@Entity(jakartaSource = JakartaSource.JAVAEE_LEGACY)
public class Habitante {
    @Id
    private String idhabitante;
//   @Referenced(from = "persona", localField = "persona.idpersona",typeReferenced = TypeReferenced.EMBEDDED)
    @Embedded
   Stream<Persona> persona;
    
    @Embedded
    Idioma idioma;

    public Habitante() {
    }

    public Habitante(String idhabitante, Stream<Persona> persona) {
        this.idhabitante = idhabitante;
        this.persona = persona;
    }

    public String getIdhabitante() {
        return idhabitante;
    }

    public void setIdhabitante(String idhabitante) {
        this.idhabitante = idhabitante;
    }

    public Stream<Persona> getPersona() {
        return persona;
    }

    public void setPersona(Stream<Persona> persona) {
        this.persona = persona;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
   
    
}
