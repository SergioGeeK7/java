/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoJSP.clase8.modo;
 // bins bens
public class DatosEstudiante {
    private String   nombreEstudiante, documentoEstudiante,emailEstudiante;
    private String edadEstudiante;

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getEdadEstudiante() {
        return edadEstudiante;
    }

    public void setEdadEstudiante(String edadEstudiante) {
        this.edadEstudiante = edadEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    public String getEmailEstudiante() {
        return emailEstudiante;
    }

    public void setEmailEstudiante(String emailEstudiante) {
        this.emailEstudiante = emailEstudiante;
    }

    
}
