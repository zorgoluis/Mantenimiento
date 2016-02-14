package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * 
 *  
 *
 * <p><a href="Estado.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Lugar extends ClaseBase 
        implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;
	private Long poblacion;
	private String coordenadas;
	private String estado;


    public Lugar() {
    }

    public Lugar(Long id){
        this.id = id;
    }

    public Lugar(String nombre, String descripcion,Long poblacion,String coordenadas,String estado){
        this.nombre=nombre;
        this.descripcion=descripcion;
		this.poblacion=poblacion;
		this.coordenadas=coordenadas;
		this.estado=estado;
    }

    /**
     * Regresa el id del Lugar.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del Lugar.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Regresa el nombre del Lugar.
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }
	public String getDescripcion() {
        return this.descripcion;
    }
	public Long getPoblacion() {
        return this.poblacion;
    }
	public String getCoordenadas() {
        return this.coordenadas;
    }
	public String getEstado() {
        return this.estado;
    }

    /**
     * Establece el nombre del Lugar.
     * @return void
     */
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
    
    /**
     * Regresa la descripción del Lugar.
     * @return String
     */
    

    /**
     * Establece la descripción del Lugar.
     * @return void
     */
    


}