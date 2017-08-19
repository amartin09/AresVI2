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
public class UsuariosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Auditoria_id")
    private int auditoriaid;

    public UsuariosPK() {
    }

    public UsuariosPK(int id, int auditoriaid) {
        this.id = id;
        this.auditoriaid = auditoriaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuditoriaid() {
        return auditoriaid;
    }

    public void setAuditoriaid(int auditoriaid) {
        this.auditoriaid = auditoriaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) auditoriaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosPK)) {
            return false;
        }
        UsuariosPK other = (UsuariosPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.auditoriaid != other.auditoriaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.UsuariosPK[ id=" + id + ", auditoriaid=" + auditoriaid + " ]";
    }
    
}
