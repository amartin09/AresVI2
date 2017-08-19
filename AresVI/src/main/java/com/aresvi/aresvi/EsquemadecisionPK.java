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
public class EsquemadecisionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CategoriaAtributo_id")
    private int categoriaAtributoid;

    public EsquemadecisionPK() {
    }

    public EsquemadecisionPK(int id, int categoriaAtributoid) {
        this.id = id;
        this.categoriaAtributoid = categoriaAtributoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoriaAtributoid() {
        return categoriaAtributoid;
    }

    public void setCategoriaAtributoid(int categoriaAtributoid) {
        this.categoriaAtributoid = categoriaAtributoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) categoriaAtributoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EsquemadecisionPK)) {
            return false;
        }
        EsquemadecisionPK other = (EsquemadecisionPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.categoriaAtributoid != other.categoriaAtributoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.EsquemadecisionPK[ id=" + id + ", categoriaAtributoid=" + categoriaAtributoid + " ]";
    }
    
}
