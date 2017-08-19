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
@Table(name = "auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a")
    , @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.auditoriaPK.id = :id")
    , @NamedQuery(name = "Auditoria.findByCalificacion", query = "SELECT a FROM Auditoria a WHERE a.calificacion = :calificacion")
    , @NamedQuery(name = "Auditoria.findByFecha", query = "SELECT a FROM Auditoria a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Auditoria.findByEmpresaid", query = "SELECT a FROM Auditoria a WHERE a.auditoriaPK.empresaid = :empresaid")
    , @NamedQuery(name = "Auditoria.findByProcesoid", query = "SELECT a FROM Auditoria a WHERE a.auditoriaPK.procesoid = :procesoid")})
public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AuditoriaPK auditoriaPK;
    @Column(name = "calificacion")
    private Integer calificacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auditoria")
    private Collection<Recomendacionproceso> recomendacionprocesoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auditoria")
    private Collection<Usuarios> usuariosCollection;
    @JoinColumn(name = "Empresa_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Empresa empresa;
    @JoinColumn(name = "Proceso_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proceso proceso;

    public Auditoria() {
    }

    public Auditoria(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public Auditoria(int id, int empresaid, int procesoid) {
        this.auditoriaPK = new AuditoriaPK(id, empresaid, procesoid);
    }

    public AuditoriaPK getAuditoriaPK() {
        return auditoriaPK;
    }

    public void setAuditoriaPK(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<Recomendacionproceso> getRecomendacionprocesoCollection() {
        return recomendacionprocesoCollection;
    }

    public void setRecomendacionprocesoCollection(Collection<Recomendacionproceso> recomendacionprocesoCollection) {
        this.recomendacionprocesoCollection = recomendacionprocesoCollection;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auditoriaPK != null ? auditoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.auditoriaPK == null && other.auditoriaPK != null) || (this.auditoriaPK != null && !this.auditoriaPK.equals(other.auditoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Auditoria[ auditoriaPK=" + auditoriaPK + " ]";
    }
    
}
