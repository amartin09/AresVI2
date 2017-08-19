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
@Table(name = "contenedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contenedor.findAll", query = "SELECT c FROM Contenedor c")
    , @NamedQuery(name = "Contenedor.findById", query = "SELECT c FROM Contenedor c WHERE c.contenedorPK.id = :id")
    , @NamedQuery(name = "Contenedor.findByNombre", query = "SELECT c FROM Contenedor c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Contenedor.findByProcesoid", query = "SELECT c FROM Contenedor c WHERE c.contenedorPK.procesoid = :procesoid")})
public class Contenedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContenedorPK contenedorPK;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "Proceso_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proceso proceso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contenedor")
    private Collection<Actividad> actividadCollection;

    public Contenedor() {
    }

    public Contenedor(ContenedorPK contenedorPK) {
        this.contenedorPK = contenedorPK;
    }

    public Contenedor(int id, int procesoid) {
        this.contenedorPK = new ContenedorPK(id, procesoid);
    }

    public ContenedorPK getContenedorPK() {
        return contenedorPK;
    }

    public void setContenedorPK(ContenedorPK contenedorPK) {
        this.contenedorPK = contenedorPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    @XmlTransient
    public Collection<Actividad> getActividadCollection() {
        return actividadCollection;
    }

    public void setActividadCollection(Collection<Actividad> actividadCollection) {
        this.actividadCollection = actividadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contenedorPK != null ? contenedorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contenedor)) {
            return false;
        }
        Contenedor other = (Contenedor) object;
        if ((this.contenedorPK == null && other.contenedorPK != null) || (this.contenedorPK != null && !this.contenedorPK.equals(other.contenedorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Contenedor[ contenedorPK=" + contenedorPK + " ]";
    }
    
}
