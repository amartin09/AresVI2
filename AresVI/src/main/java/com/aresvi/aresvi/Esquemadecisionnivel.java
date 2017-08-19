/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "esquemadecisionnivel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esquemadecisionnivel.findAll", query = "SELECT e FROM Esquemadecisionnivel e")
    , @NamedQuery(name = "Esquemadecisionnivel.findById", query = "SELECT e FROM Esquemadecisionnivel e WHERE e.esquemadecisionnivelPK.id = :id")
    , @NamedQuery(name = "Esquemadecisionnivel.findByPorcentje", query = "SELECT e FROM Esquemadecisionnivel e WHERE e.porcentje = :porcentje")
    , @NamedQuery(name = "Esquemadecisionnivel.findByEsquemaDecisionid", query = "SELECT e FROM Esquemadecisionnivel e WHERE e.esquemadecisionnivelPK.esquemaDecisionid = :esquemaDecisionid")
    , @NamedQuery(name = "Esquemadecisionnivel.findByPonderacionid", query = "SELECT e FROM Esquemadecisionnivel e WHERE e.esquemadecisionnivelPK.ponderacionid = :ponderacionid")})
public class Esquemadecisionnivel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EsquemadecisionnivelPK esquemadecisionnivelPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentje")
    private Float porcentje;
    @JoinColumn(name = "EsquemaDecision_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Esquemadecision esquemadecision;
    @JoinColumn(name = "Ponderacion_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ponderacion ponderacion;

    public Esquemadecisionnivel() {
    }

    public Esquemadecisionnivel(EsquemadecisionnivelPK esquemadecisionnivelPK) {
        this.esquemadecisionnivelPK = esquemadecisionnivelPK;
    }

    public Esquemadecisionnivel(int id, int esquemaDecisionid, int ponderacionid) {
        this.esquemadecisionnivelPK = new EsquemadecisionnivelPK(id, esquemaDecisionid, ponderacionid);
    }

    public EsquemadecisionnivelPK getEsquemadecisionnivelPK() {
        return esquemadecisionnivelPK;
    }

    public void setEsquemadecisionnivelPK(EsquemadecisionnivelPK esquemadecisionnivelPK) {
        this.esquemadecisionnivelPK = esquemadecisionnivelPK;
    }

    public Float getPorcentje() {
        return porcentje;
    }

    public void setPorcentje(Float porcentje) {
        this.porcentje = porcentje;
    }

    public Esquemadecision getEsquemadecision() {
        return esquemadecision;
    }

    public void setEsquemadecision(Esquemadecision esquemadecision) {
        this.esquemadecision = esquemadecision;
    }

    public Ponderacion getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(Ponderacion ponderacion) {
        this.ponderacion = ponderacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (esquemadecisionnivelPK != null ? esquemadecisionnivelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esquemadecisionnivel)) {
            return false;
        }
        Esquemadecisionnivel other = (Esquemadecisionnivel) object;
        if ((this.esquemadecisionnivelPK == null && other.esquemadecisionnivelPK != null) || (this.esquemadecisionnivelPK != null && !this.esquemadecisionnivelPK.equals(other.esquemadecisionnivelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Esquemadecisionnivel[ esquemadecisionnivelPK=" + esquemadecisionnivelPK + " ]";
    }
    
}
