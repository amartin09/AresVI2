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
@Table(name = "ponderacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ponderacion.findAll", query = "SELECT p FROM Ponderacion p")
    , @NamedQuery(name = "Ponderacion.findById", query = "SELECT p FROM Ponderacion p WHERE p.id = :id")
    , @NamedQuery(name = "Ponderacion.findByNombre", query = "SELECT p FROM Ponderacion p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Ponderacion.findByValor", query = "SELECT p FROM Ponderacion p WHERE p.valor = :valor")})
public class Ponderacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "valor")
    private Integer valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ponderacion")
    private Collection<Atributo> atributoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ponderacion")
    private Collection<Esquemadecisionnivel> esquemadecisionnivelCollection;

    public Ponderacion() {
    }

    public Ponderacion(Integer id) {
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

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @XmlTransient
    public Collection<Atributo> getAtributoCollection() {
        return atributoCollection;
    }

    public void setAtributoCollection(Collection<Atributo> atributoCollection) {
        this.atributoCollection = atributoCollection;
    }

    @XmlTransient
    public Collection<Esquemadecisionnivel> getEsquemadecisionnivelCollection() {
        return esquemadecisionnivelCollection;
    }

    public void setEsquemadecisionnivelCollection(Collection<Esquemadecisionnivel> esquemadecisionnivelCollection) {
        this.esquemadecisionnivelCollection = esquemadecisionnivelCollection;
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
        if (!(object instanceof Ponderacion)) {
            return false;
        }
        Ponderacion other = (Ponderacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Ponderacion[ id=" + id + " ]";
    }
    
}
