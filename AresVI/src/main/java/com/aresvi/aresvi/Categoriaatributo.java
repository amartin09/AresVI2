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
@Table(name = "categoriaatributo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriaatributo.findAll", query = "SELECT c FROM Categoriaatributo c")
    , @NamedQuery(name = "Categoriaatributo.findById", query = "SELECT c FROM Categoriaatributo c WHERE c.categoriaatributoPK.id = :id")
    , @NamedQuery(name = "Categoriaatributo.findByDescripcion", query = "SELECT c FROM Categoriaatributo c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Categoriaatributo.findByNombre", query = "SELECT c FROM Categoriaatributo c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Categoriaatributo.findByAtributoid", query = "SELECT c FROM Categoriaatributo c WHERE c.categoriaatributoPK.atributoid = :atributoid")})
public class Categoriaatributo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoriaatributoPK categoriaatributoPK;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "Atributo_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Atributo atributo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaatributo")
    private Collection<Esquemadecision> esquemadecisionCollection;

    public Categoriaatributo() {
    }

    public Categoriaatributo(CategoriaatributoPK categoriaatributoPK) {
        this.categoriaatributoPK = categoriaatributoPK;
    }

    public Categoriaatributo(int id, int atributoid) {
        this.categoriaatributoPK = new CategoriaatributoPK(id, atributoid);
    }

    public CategoriaatributoPK getCategoriaatributoPK() {
        return categoriaatributoPK;
    }

    public void setCategoriaatributoPK(CategoriaatributoPK categoriaatributoPK) {
        this.categoriaatributoPK = categoriaatributoPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    @XmlTransient
    public Collection<Esquemadecision> getEsquemadecisionCollection() {
        return esquemadecisionCollection;
    }

    public void setEsquemadecisionCollection(Collection<Esquemadecision> esquemadecisionCollection) {
        this.esquemadecisionCollection = esquemadecisionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaatributoPK != null ? categoriaatributoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriaatributo)) {
            return false;
        }
        Categoriaatributo other = (Categoriaatributo) object;
        if ((this.categoriaatributoPK == null && other.categoriaatributoPK != null) || (this.categoriaatributoPK != null && !this.categoriaatributoPK.equals(other.categoriaatributoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Categoriaatributo[ categoriaatributoPK=" + categoriaatributoPK + " ]";
    }
    
}
