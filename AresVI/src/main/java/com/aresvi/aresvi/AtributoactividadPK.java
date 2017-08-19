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
public class AtributoactividadPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Actividad_id")
    private int actividadid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Actividad_Contenedor_id")
    private int actividadContenedorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Actividad_Contenedor_Proceso_id")
    private int actividadContenedorProcesoid;

    public AtributoactividadPK() {
    }

    public AtributoactividadPK(int id, int actividadid, int actividadContenedorid, int actividadContenedorProcesoid) {
        this.id = id;
        this.actividadid = actividadid;
        this.actividadContenedorid = actividadContenedorid;
        this.actividadContenedorProcesoid = actividadContenedorProcesoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActividadid() {
        return actividadid;
    }

    public void setActividadid(int actividadid) {
        this.actividadid = actividadid;
    }

    public int getActividadContenedorid() {
        return actividadContenedorid;
    }

    public void setActividadContenedorid(int actividadContenedorid) {
        this.actividadContenedorid = actividadContenedorid;
    }

    public int getActividadContenedorProcesoid() {
        return actividadContenedorProcesoid;
    }

    public void setActividadContenedorProcesoid(int actividadContenedorProcesoid) {
        this.actividadContenedorProcesoid = actividadContenedorProcesoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) actividadid;
        hash += (int) actividadContenedorid;
        hash += (int) actividadContenedorProcesoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtributoactividadPK)) {
            return false;
        }
        AtributoactividadPK other = (AtributoactividadPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.actividadid != other.actividadid) {
            return false;
        }
        if (this.actividadContenedorid != other.actividadContenedorid) {
            return false;
        }
        if (this.actividadContenedorProcesoid != other.actividadContenedorProcesoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.AtributoactividadPK[ id=" + id + ", actividadid=" + actividadid + ", actividadContenedorid=" + actividadContenedorid + ", actividadContenedorProcesoid=" + actividadContenedorProcesoid + " ]";
    }
    
}
