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
public final class FormaNuevoLugar
        extends ValidatorForm {

    private String nombre;
    private String descripcion;
	private Long poblacion;
	private String coordenadas;
	private String estado;

    

    public String getNombre() {
        return (this.nombre);
    }

    public String getDescripcion() {
        return (this.descripcion);
    }
	public Long getPoblacion() {
        return (this.poblacion);
    }
	public String getCoordenadas() {
        return (this.coordenadas);
    }
	public String getEstado() {
        return (this.estado);
    }
	
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
	
	public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }
	public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
	public void setEstado(String estado) {
        this.estado = estado;
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
