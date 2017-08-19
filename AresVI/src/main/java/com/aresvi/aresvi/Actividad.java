/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findById", query = "SELECT a FROM Actividad a WHERE a.actividadPK.id = :id")
    , @NamedQuery(name = "Actividad.findByNombre", query = "SELECT a FROM Actividad a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Actividad.findByContenedorid", query = "SELECT a FROM Actividad a WHERE a.actividadPK.contenedorid = :contenedorid")
    , @NamedQuery(name = "Actividad.findByContenedorProcesoid", query = "SELECT a FROM Actividad a WHERE a.actividadPK.contenedorProcesoid = :contenedorProcesoid")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActividadPK actividadPK;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Atributoactividad> atributoactividadCollection;
    @JoinColumns({
        @JoinColumn(name = "Contenedor_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "Contenedor_Proceso_id", referencedColumnName = "Proceso_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Contenedor contenedor;

    public Actividad() {
    }

    public Actividad(ActividadPK actividadPK) {
        this.actividadPK = actividadPK;
    }

    public Actividad(int id, int contenedorid, int contenedorProcesoid) {
        this.actividadPK = new ActividadPK(id, contenedorid, contenedorProcesoid);
    }

    public ActividadPK getActividadPK() {
        return actividadPK;
    }

    public void setActividadPK(ActividadPK actividadPK) {
        this.actividadPK = actividadPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Atributoactividad> getAtributoactividadCollection() {
        return atributoactividadCollection;
    }

    public void setAtributoactividadCollection(Collection<Atributoactividad> atributoactividadCollection) {
        this.atributoactividadCollection = atributoactividadCollection;
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividadPK != null ? actividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.actividadPK == null && other.actividadPK != null) || (this.actividadPK != null && !this.actividadPK.equals(other.actividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Actividad[ actividadPK=" + actividadPK + " ]";
    }
    
}
