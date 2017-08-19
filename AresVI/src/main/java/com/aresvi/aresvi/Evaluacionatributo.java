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
@Table(name = "evaluacionatributo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluacionatributo.findAll", query = "SELECT e FROM Evaluacionatributo e")
    , @NamedQuery(name = "Evaluacionatributo.findById", query = "SELECT e FROM Evaluacionatributo e WHERE e.id = :id")
    , @NamedQuery(name = "Evaluacionatributo.findByCumplido", query = "SELECT e FROM Evaluacionatributo e WHERE e.cumplido = :cumplido")
    , @NamedQuery(name = "Evaluacionatributo.findByObservaciones", query = "SELECT e FROM Evaluacionatributo e WHERE e.observaciones = :observaciones")})
public class Evaluacionatributo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "cumplido")
    private Short cumplido;
    @Size(max = 45)
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaluacionatributo")
    private Collection<Recomendacionproceso> recomendacionprocesoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaluacionatributo")
    private Collection<Atributo> atributoCollection;

    public Evaluacionatributo() {
    }

    public Evaluacionatributo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getCumplido() {
        return cumplido;
    }

    public void setCumplido(Short cumplido) {
        this.cumplido = cumplido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public Collection<Recomendacionproceso> getRecomendacionprocesoCollection() {
        return recomendacionprocesoCollection;
    }

    public void setRecomendacionprocesoCollection(Collection<Recomendacionproceso> recomendacionprocesoCollection) {
        this.recomendacionprocesoCollection = recomendacionprocesoCollection;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluacionatributo)) {
            return false;
        }
        Evaluacionatributo other = (Evaluacionatributo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Evaluacionatributo[ id=" + id + " ]";
    }
    
}
