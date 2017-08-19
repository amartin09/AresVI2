/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "proceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proceso.findAll", query = "SELECT p FROM Proceso p")
    , @NamedQuery(name = "Proceso.findById", query = "SELECT p FROM Proceso p WHERE p.id = :id")
    , @NamedQuery(name = "Proceso.findByNombre", query = "SELECT p FROM Proceso p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Proceso.findByNumero", query = "SELECT p FROM Proceso p WHERE p.numero = :numero")
    , @NamedQuery(name = "Proceso.findByProcesocol", query = "SELECT p FROM Proceso p WHERE p.procesocol = :procesocol")})
public class Proceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 45)
    @Column(name = "Procesocol")
    private String procesocol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proceso")
    private Collection<Contenedor> contenedorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proceso")
    private Collection<Recomendacionproceso> recomendacionprocesoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proceso")
    private Collection<Auditoria> auditoriaCollection;

    public Proceso() {
    }

    public Proceso(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProcesocol() {
        return procesocol;
    }

    public void setProcesocol(String procesocol) {
        this.procesocol = procesocol;
    }

    @XmlTransient
    public Collection<Contenedor> getContenedorCollection() {
        return contenedorCollection;
    }

    public void setContenedorCollection(Collection<Contenedor> contenedorCollection) {
        this.contenedorCollection = contenedorCollection;
    }

    @XmlTransient
    public Collection<Recomendacionproceso> getRecomendacionprocesoCollection() {
        return recomendacionprocesoCollection;
    }

    public void setRecomendacionprocesoCollection(Collection<Recomendacionproceso> recomendacionprocesoCollection) {
        this.recomendacionprocesoCollection = recomendacionprocesoCollection;
    }

    @XmlTransient
    public Collection<Auditoria> getAuditoriaCollection() {
        return auditoriaCollection;
    }

    public void setAuditoriaCollection(Collection<Auditoria> auditoriaCollection) {
        this.auditoriaCollection = auditoriaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proceso)) {
            return false;
        }
        Proceso other = (Proceso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Proceso[ id=" + id + " ]";
    }
    
}
