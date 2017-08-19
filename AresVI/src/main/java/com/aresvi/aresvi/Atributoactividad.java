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
@Table(name = "atributoactividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atributoactividad.findAll", query = "SELECT a FROM Atributoactividad a")
    , @NamedQuery(name = "Atributoactividad.findById", query = "SELECT a FROM Atributoactividad a WHERE a.atributoactividadPK.id = :id")
    , @NamedQuery(name = "Atributoactividad.findByNombre", query = "SELECT a FROM Atributoactividad a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Atributoactividad.findByActividadid", query = "SELECT a FROM Atributoactividad a WHERE a.atributoactividadPK.actividadid = :actividadid")
    , @NamedQuery(name = "Atributoactividad.findByActividadContenedorid", query = "SELECT a FROM Atributoactividad a WHERE a.atributoactividadPK.actividadContenedorid = :actividadContenedorid")
    , @NamedQuery(name = "Atributoactividad.findByActividadContenedorProcesoid", query = "SELECT a FROM Atributoactividad a WHERE a.atributoactividadPK.actividadContenedorProcesoid = :actividadContenedorProcesoid")})
public class Atributoactividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtributoactividadPK atributoactividadPK;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumns({
        @JoinColumn(name = "Actividad_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "Actividad_Contenedor_id", referencedColumnName = "Contenedor_id", insertable = false, updatable = false)
        , @JoinColumn(name = "Actividad_Contenedor_Proceso_id", referencedColumnName = "Contenedor_Proceso_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Actividad actividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atributoactividad")
    private Collection<Atributo> atributoCollection;

    public Atributoactividad() {
    }

    public Atributoactividad(AtributoactividadPK atributoactividadPK) {
        this.atributoactividadPK = atributoactividadPK;
    }

    public Atributoactividad(int id, int actividadid, int actividadContenedorid, int actividadContenedorProcesoid) {
        this.atributoactividadPK = new AtributoactividadPK(id, actividadid, actividadContenedorid, actividadContenedorProcesoid);
    }

    public AtributoactividadPK getAtributoactividadPK() {
        return atributoactividadPK;
    }

    public void setAtributoactividadPK(AtributoactividadPK atributoactividadPK) {
        this.atributoactividadPK = atributoactividadPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @XmlTransient
    public Collection<Atributo> getAtributoCollection() {
        return atributoCollection;
    }

    public void setAtributoCollection(Collection<Atributo> atributoCollection) {
        this.atributoCollection = atributoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atributoactividadPK != null ? atributoactividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atributoactividad)) {
            return false;
        }
        Atributoactividad other = (Atributoactividad) object;
        if ((this.atributoactividadPK == null && other.atributoactividadPK != null) || (this.atributoactividadPK != null && !this.atributoactividadPK.equals(other.atributoactividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Atributoactividad[ atributoactividadPK=" + atributoactividadPK + " ]";
    }
    
}
