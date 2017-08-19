/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ariel
 */
@Embeddable
public class RecomendacionprocesoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EvaluacionAtributo_id")
    private int evaluacionAtributoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Proceso_id")
    private int procesoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Auditoria_id")
    private int auditoriaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Auditoria_Empresa_id")
    private int auditoriaEmpresaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Auditoria_Proceso_id")
    private int auditoriaProcesoid;

    public RecomendacionprocesoPK() {
    }

    public RecomendacionprocesoPK(int id, int evaluacionAtributoid, int procesoid, int auditoriaid, int auditoriaEmpresaid, int auditoriaProcesoid) {
        this.id = id;
        this.evaluacionAtributoid = evaluacionAtributoid;
        this.procesoid = procesoid;
        this.auditoriaid = auditoriaid;
        this.auditoriaEmpresaid = auditoriaEmpresaid;
        this.auditoriaProcesoid = auditoriaProcesoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvaluacionAtributoid() {
        return evaluacionAtributoid;
    }

    public void setEvaluacionAtributoid(int evaluacionAtributoid) {
        this.evaluacionAtributoid = evaluacionAtributoid;
    }

    public int getProcesoid() {
        return procesoid;
    }

    public void setProcesoid(int procesoid) {
        this.procesoid = procesoid;
    }

    public int getAuditoriaid() {
        return auditoriaid;
    }

    public void setAuditoriaid(int auditoriaid) {
        this.auditoriaid = auditoriaid;
    }

    public int getAuditoriaEmpresaid() {
        return auditoriaEmpresaid;
    }

    public void setAuditoriaEmpresaid(int auditoriaEmpresaid) {
        this.auditoriaEmpresaid = auditoriaEmpresaid;
    }

    public int getAuditoriaProcesoid() {
        return auditoriaProcesoid;
    }

    public void setAuditoriaProcesoid(int auditoriaProcesoid) {
        this.auditoriaProcesoid = auditoriaProcesoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) evaluacionAtributoid;
        hash += (int) procesoid;
        hash += (int) auditoriaid;
        hash += (int) auditoriaEmpresaid;
        hash += (int) auditoriaProcesoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecomendacionprocesoPK)) {
            return false;
        }
        RecomendacionprocesoPK other = (RecomendacionprocesoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.evaluacionAtributoid != other.evaluacionAtributoid) {
            return false;
        }
        if (this.procesoid != other.procesoid) {
            return false;
        }
        if (this.auditoriaid != other.auditoriaid) {
            return false;
        }
        if (this.auditoriaEmpresaid != other.auditoriaEmpresaid) {
            return false;
        }
        if (this.auditoriaProcesoid != other.auditoriaProcesoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.RecomendacionprocesoPK[ id=" + id + ", evaluacionAtributoid=" + evaluacionAtributoid + ", procesoid=" + procesoid + ", auditoriaid=" + auditoriaid + ", auditoriaEmpresaid=" + auditoriaEmpresaid + ", auditoriaProcesoid=" + auditoriaProcesoid + " ]";
    }
    
}
