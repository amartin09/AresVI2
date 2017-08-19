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
public class CategoriaatributoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Atributo_id")
    private int atributoid;

    public CategoriaatributoPK() {
    }

    public CategoriaatributoPK(int id, int atributoid) {
        this.id = id;
        this.atributoid = atributoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtributoid() {
        return atributoid;
    }

    public void setAtributoid(int atributoid) {
        this.atributoid = atributoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) atributoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaatributoPK)) {
            return false;
        }
        CategoriaatributoPK other = (CategoriaatributoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.atributoid != other.atributoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.CategoriaatributoPK[ id=" + id + ", atributoid=" + atributoid + " ]";
    }
    
}
