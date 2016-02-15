package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva persona.
 *
 * @author Victor Ramos
 */
public final class FormaNuevoRecomendacion
        extends ValidatorForm {

    private Long id;
    private String nombre;
    private String usuario;
    private String fecha;
    private String comentario;
    private Long calificacion;
    private String descripcion;

    

    public String getNombre() {
        return (this.nombre);
    }
    public String getUsuario() {
        return (this.usuario);
    }
    public String getFecha() {
        return (this.fecha);
    }
    public String getComentario() {
        return (this.comentario);
    }
    public Long getCalificacion() {
        return (this.calificacion);
    }
    public String getDescripcion() {
        return (this.descripcion);
    }


	
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        nombre=null;
        descripcion=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
