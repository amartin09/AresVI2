/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "esquemadecision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esquemadecision.findAll", query = "SELECT e FROM Esquemadecision e")
    , @NamedQuery(name = "Esquemadecision.findById", query = "SELECT e FROM Esquemadecision e WHERE e.esquemadecisionPK.id = :id")
    , @NamedQuery(name = "Esquemadecision.findByFechaDesde", query = "SELECT e FROM Esquemadecision e WHERE e.fechaDesde = :fechaDesde")
    , @NamedQuery(name = "Esquemadecision.findByFechaHasta", query = "SELECT e FROM Esquemadecision e WHERE e.fechaHasta = :fechaHasta")
    , @NamedQuery(name = "Esquemadecision.findByPorcentajeNoObligatorio", query = "SELECT e FROM Esquemadecision e WHERE e.porcentajeNoObligatorio = :porcentajeNoObligatorio")
    , @NamedQuery(name = "Esquemadecision.findByCategoriaAtributoid", query = "SELECT e FROM Esquemadecision e WHERE e.esquemadecisionPK.categoriaAtributoid = :categoriaAtributoid")})
public class Esquemadecision implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EsquemadecisionPK esquemadecisionPK;
    @Column(name = "fechaDesde")
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    @Column(name = "fechaHasta")
    @Temporal(TemporalType.DATE)
    private Date fechaHasta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentajeNoObligatorio")
    private Float porcentajeNoObligatorio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "esquemadecision")
    private Collection<Esquemadecisionnivel> esquemadecisionnivelCollection;
    @JoinColumn(name = "CategoriaAtributo_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Categoriaatributo categoriaatributo;

    public Esquemadecision() {
    }

    public Esquemadecision(EsquemadecisionPK esquemadecisionPK) {
        this.esquemadecisionPK = esquemadecisionPK;
    }

    public Esquemadecision(int id, int categoriaAtributoid) {
        this.esquemadecisionPK = new EsquemadecisionPK(id, categoriaAtributoid);
    }

    public EsquemadecisionPK getEsquemadecisionPK() {
        return esquemadecisionPK;
    }

    public void setEsquemadecisionPK(EsquemadecisionPK esquemadecisionPK) {
        this.esquemadecisionPK = esquemadecisionPK;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Float getPorcentajeNoObligatorio() {
        return porcentajeNoObligatorio;
    }

    public void setPorcentajeNoObligatorio(Float porcentajeNoObligatorio) {
        this.porcentajeNoObligatorio = porcentajeNoObligatorio;
    }

    @XmlTransient
    public Collection<Esquemadecisionnivel> getEsquemadecisionnivelCollection() {
        return esquemadecisionnivelCollection;
    }

    public void setEsquemadecisionnivelCollection(Collection<Esquemadecisionnivel> esquemadecisionnivelCollection) {
        this.esquemadecisionnivelCollection = esquemadecisionnivelCollection;
    }

    public Categoriaatributo getCategoriaatributo() {
        return categoriaatributo;
    }

    public void setCategoriaatributo(Categoriaatributo categoriaatributo) {
        this.categoriaatributo = categoriaatributo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (esquemadecisionPK != null ? esquemadecisionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esquemadecision)) {
            return false;
        }
        Esquemadecision other = (Esquemadecision) object;
        if ((this.esquemadecisionPK == null && other.esquemadecisionPK != null) || (this.esquemadecisionPK != null && !this.esquemadecisionPK.equals(other.esquemadecisionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Esquemadecision[ esquemadecisionPK=" + esquemadecisionPK + " ]";
    }
    
}
