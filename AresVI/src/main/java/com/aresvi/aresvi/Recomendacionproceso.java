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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "recomendacionproceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recomendacionproceso.findAll", query = "SELECT r FROM Recomendacionproceso r")
    , @NamedQuery(name = "Recomendacionproceso.findById", query = "SELECT r FROM Recomendacionproceso r WHERE r.recomendacionprocesoPK.id = :id")
    , @NamedQuery(name = "Recomendacionproceso.findByDescripcion", query = "SELECT r FROM Recomendacionproceso r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Recomendacionproceso.findByEvaluacionAtributoid", query = "SELECT r FROM Recomendacionproceso r WHERE r.recomendacionprocesoPK.evaluacionAtributoid = :evaluacionAtributoid")
    , @NamedQuery(name = "Recomendacionproceso.findByProcesoid", query = "SELECT r FROM Recomendacionproceso r WHERE r.recomendacionprocesoPK.procesoid = :procesoid")
    , @NamedQuery(name = "Recomendacionproceso.findByAuditoriaid", query = "SELECT r FROM Recomendacionproceso r WHERE r.recomendacionprocesoPK.auditoriaid = :auditoriaid")
    , @NamedQuery(name = "Recomendacionproceso.findByAuditoriaEmpresaid", query = "SELECT r FROM Recomendacionproceso r WHERE r.recomendacionprocesoPK.auditoriaEmpresaid = :auditoriaEmpresaid")
    , @NamedQuery(name = "Recomendacionproceso.findByAuditoriaProcesoid", query = "SELECT r FROM Recomendacionproceso r WHERE r.recomendacionprocesoPK.auditoriaProcesoid = :auditoriaProcesoid")})
public class Recomendacionproceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RecomendacionprocesoPK recomendacionprocesoPK;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumns({
        @JoinColumn(name = "Auditoria_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "Auditoria_Empresa_id", referencedColumnName = "Empresa_id", insertable = false, updatable = false)
        , @JoinColumn(name = "Auditoria_Proceso_id", referencedColumnName = "Proceso_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Auditoria auditoria;
    @JoinColumn(name = "EvaluacionAtributo_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Evaluacionatributo evaluacionatributo;
    @JoinColumn(name = "Proceso_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proceso proceso;

    public Recomendacionproceso() {
    }

    public Recomendacionproceso(RecomendacionprocesoPK recomendacionprocesoPK) {
        this.recomendacionprocesoPK = recomendacionprocesoPK;
    }

    public Recomendacionproceso(int id, int evaluacionAtributoid, int procesoid, int auditoriaid, int auditoriaEmpresaid, int auditoriaProcesoid) {
        this.recomendacionprocesoPK = new RecomendacionprocesoPK(id, evaluacionAtributoid, procesoid, auditoriaid, auditoriaEmpresaid, auditoriaProcesoid);
    }

    public RecomendacionprocesoPK getRecomendacionprocesoPK() {
        return recomendacionprocesoPK;
    }

    public void setRecomendacionprocesoPK(RecomendacionprocesoPK recomendacionprocesoPK) {
        this.recomendacionprocesoPK = recomendacionprocesoPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }

    public Evaluacionatributo getEvaluacionatributo() {
        return evaluacionatributo;
    }

    public void setEvaluacionatributo(Evaluacionatributo evaluacionatributo) {
        this.evaluacionatributo = evaluacionatributo;
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
        hash += (recomendacionprocesoPK != null ? recomendacionprocesoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recomendacionproceso)) {
            return false;
        }
        Recomendacionproceso other = (Recomendacionproceso) object;
        if ((this.recomendacionprocesoPK == null && other.recomendacionprocesoPK != null) || (this.recomendacionprocesoPK != null && !this.recomendacionprocesoPK.equals(other.recomendacionprocesoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Recomendacionproceso[ recomendacionprocesoPK=" + recomendacionprocesoPK + " ]";
    }
    
}
