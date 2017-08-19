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
public class AuditoriaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empresa_id")
    private int empresaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Proceso_id")
    private int procesoid;

    public AuditoriaPK() {
    }

    public AuditoriaPK(int id, int empresaid, int procesoid) {
        this.id = id;
        this.empresaid = empresaid;
        this.procesoid = procesoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(int empresaid) {
        this.empresaid = empresaid;
    }

    public int getProcesoid() {
        return procesoid;
    }

    public void setProcesoid(int procesoid) {
        this.procesoid = procesoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) empresaid;
        hash += (int) procesoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuditoriaPK)) {
            return false;
        }
        AuditoriaPK other = (AuditoriaPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.empresaid != other.empresaid) {
            return false;
        }
        if (this.procesoid != other.procesoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.AuditoriaPK[ id=" + id + ", empresaid=" + empresaid + ", procesoid=" + procesoid + " ]";
    }
    
}
