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
public class ActividadPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Contenedor_id")
    private int contenedorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Contenedor_Proceso_id")
    private int contenedorProcesoid;

    public ActividadPK() {
    }

    public ActividadPK(int id, int contenedorid, int contenedorProcesoid) {
        this.id = id;
        this.contenedorid = contenedorid;
        this.contenedorProcesoid = contenedorProcesoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContenedorid() {
        return contenedorid;
    }

    public void setContenedorid(int contenedorid) {
        this.contenedorid = contenedorid;
    }

    public int getContenedorProcesoid() {
        return contenedorProcesoid;
    }

    public void setContenedorProcesoid(int contenedorProcesoid) {
        this.contenedorProcesoid = contenedorProcesoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) contenedorid;
        hash += (int) contenedorProcesoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadPK)) {
            return false;
        }
        ActividadPK other = (ActividadPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.contenedorid != other.contenedorid) {
            return false;
        }
        if (this.contenedorProcesoid != other.contenedorProcesoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.ActividadPK[ id=" + id + ", contenedorid=" + contenedorid + ", contenedorProcesoid=" + contenedorProcesoid + " ]";
    }
    
}
