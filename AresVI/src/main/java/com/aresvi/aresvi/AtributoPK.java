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
public class AtributoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ponderacion_id")
    private int ponderacionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EvaluacionAtributo_id")
    private int evaluacionAtributoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AtributoActividad_id")
    private int atributoActividadid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AtributoActividad_Actividad_id")
    private int atributoActividadActividadid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AtributoActividad_Actividad_Contenedor_id")
    private int atributoActividadActividadContenedorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AtributoActividad_Actividad_Contenedor_Proceso_id")
    private int atributoActividadActividadContenedorProcesoid;

    public AtributoPK() {
    }

    public AtributoPK(int id, int ponderacionid, int evaluacionAtributoid, int atributoActividadid, int atributoActividadActividadid, int atributoActividadActividadContenedorid, int atributoActividadActividadContenedorProcesoid) {
        this.id = id;
        this.ponderacionid = ponderacionid;
        this.evaluacionAtributoid = evaluacionAtributoid;
        this.atributoActividadid = atributoActividadid;
        this.atributoActividadActividadid = atributoActividadActividadid;
        this.atributoActividadActividadContenedorid = atributoActividadActividadContenedorid;
        this.atributoActividadActividadContenedorProcesoid = atributoActividadActividadContenedorProcesoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPonderacionid() {
        return ponderacionid;
    }

    public void setPonderacionid(int ponderacionid) {
        this.ponderacionid = ponderacionid;
    }

    public int getEvaluacionAtributoid() {
        return evaluacionAtributoid;
    }

    public void setEvaluacionAtributoid(int evaluacionAtributoid) {
        this.evaluacionAtributoid = evaluacionAtributoid;
    }

    public int getAtributoActividadid() {
        return atributoActividadid;
    }

    public void setAtributoActividadid(int atributoActividadid) {
        this.atributoActividadid = atributoActividadid;
    }

    public int getAtributoActividadActividadid() {
        return atributoActividadActividadid;
    }

    public void setAtributoActividadActividadid(int atributoActividadActividadid) {
        this.atributoActividadActividadid = atributoActividadActividadid;
    }

    public int getAtributoActividadActividadContenedorid() {
        return atributoActividadActividadContenedorid;
    }

    public void setAtributoActividadActividadContenedorid(int atributoActividadActividadContenedorid) {
        this.atributoActividadActividadContenedorid = atributoActividadActividadContenedorid;
    }

    public int getAtributoActividadActividadContenedorProcesoid() {
        return atributoActividadActividadContenedorProcesoid;
    }

    public void setAtributoActividadActividadContenedorProcesoid(int atributoActividadActividadContenedorProcesoid) {
        this.atributoActividadActividadContenedorProcesoid = atributoActividadActividadContenedorProcesoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) ponderacionid;
        hash += (int) evaluacionAtributoid;
        hash += (int) atributoActividadid;
        hash += (int) atributoActividadActividadid;
        hash += (int) atributoActividadActividadContenedorid;
        hash += (int) atributoActividadActividadContenedorProcesoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtributoPK)) {
            return false;
        }
        AtributoPK other = (AtributoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.ponderacionid != other.ponderacionid) {
            return false;
        }
        if (this.evaluacionAtributoid != other.evaluacionAtributoid) {
            return false;
        }
        if (this.atributoActividadid != other.atributoActividadid) {
            return false;
        }
        if (this.atributoActividadActividadid != other.atributoActividadActividadid) {
            return false;
        }
        if (this.atributoActividadActividadContenedorid != other.atributoActividadActividadContenedorid) {
            return false;
        }
        if (this.atributoActividadActividadContenedorProcesoid != other.atributoActividadActividadContenedorProcesoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.AtributoPK[ id=" + id + ", ponderacionid=" + ponderacionid + ", evaluacionAtributoid=" + evaluacionAtributoid + ", atributoActividadid=" + atributoActividadid + ", atributoActividadActividadid=" + atributoActividadActividadid + ", atributoActividadActividadContenedorid=" + atributoActividadActividadContenedorid + ", atributoActividadActividadContenedorProcesoid=" + atributoActividadActividadContenedorProcesoid + " ]";
    }
    
}
