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
public class EmpresaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ContactoEmpresa_id")
    private int contactoEmpresaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DireccionEmpresa_id")
    private int direccionEmpresaid;

    public EmpresaPK() {
    }

    public EmpresaPK(int id, int contactoEmpresaid, int direccionEmpresaid) {
        this.id = id;
        this.contactoEmpresaid = contactoEmpresaid;
        this.direccionEmpresaid = direccionEmpresaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactoEmpresaid() {
        return contactoEmpresaid;
    }

    public void setContactoEmpresaid(int contactoEmpresaid) {
        this.contactoEmpresaid = contactoEmpresaid;
    }

    public int getDireccionEmpresaid() {
        return direccionEmpresaid;
    }

    public void setDireccionEmpresaid(int direccionEmpresaid) {
        this.direccionEmpresaid = direccionEmpresaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) contactoEmpresaid;
        hash += (int) direccionEmpresaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaPK)) {
            return false;
        }
        EmpresaPK other = (EmpresaPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.contactoEmpresaid != other.contactoEmpresaid) {
            return false;
        }
        if (this.direccionEmpresaid != other.direccionEmpresaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.EmpresaPK[ id=" + id + ", contactoEmpresaid=" + contactoEmpresaid + ", direccionEmpresaid=" + direccionEmpresaid + " ]";
    }
    
}
