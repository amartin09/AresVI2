/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "atributo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atributo.findAll", query = "SELECT a FROM Atributo a")
    , @NamedQuery(name = "Atributo.findById", query = "SELECT a FROM Atributo a WHERE a.atributoPK.id = :id")
    , @NamedQuery(name = "Atributo.findByNombre", query = "SELECT a FROM Atributo a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Atributo.findByRequirido", query = "SELECT a FROM Atributo a WHERE a.requirido = :requirido")
    , @NamedQuery(name = "Atributo.findByPonderacionid", query = "SELECT a FROM Atributo a WHERE a.atributoPK.ponderacionid = :ponderacionid")
    , @NamedQuery(name = "Atributo.findByEvaluacionAtributoid", query = "SELECT a FROM Atributo a WHERE a.atributoPK.evaluacionAtributoid = :evaluacionAtributoid")
    , @NamedQuery(name = "Atributo.findByAtributoActividadid", query = "SELECT a FROM Atributo a WHERE a.atributoPK.atributoActividadid = :atributoActividadid")
    , @NamedQuery(name = "Atributo.findByAtributoActividadActividadid", query = "SELECT a FROM Atributo a WHERE a.atributoPK.atributoActividadActividadid = :atributoActividadActividadid")
    , @NamedQuery(name = "Atributo.findByAtributoActividadActividadContenedorid", query = "SELECT a FROM Atributo a WHERE a.atributoPK.atributoActividadActividadContenedorid = :atributoActividadActividadContenedorid")
    , @NamedQuery(name = "Atributo.findByAtributoActividadActividadContenedorProcesoid", query = "SELECT a FROM Atributo a WHERE a.atributoPK.atributoActividadActividadContenedorProcesoid = :atributoActividadActividadContenedorProcesoid")})
public class Atributo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtributoPK atributoPK;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "requirido")
    private Short requirido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atributo")
    private Collection<Categoriaatributo> categoriaatributoCollection;
    @JoinColumns({
        @JoinColumn(name = "AtributoActividad_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "AtributoActividad_Actividad_id", referencedColumnName = "Actividad_id", insertable = false, updatable = false)
        , @JoinColumn(name = "AtributoActividad_Actividad_Contenedor_id", referencedColumnName = "Actividad_Contenedor_id", insertable = false, updatable = false)
        , @JoinColumn(name = "AtributoActividad_Actividad_Contenedor_Proceso_id", referencedColumnName = "Actividad_Contenedor_Proceso_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Atributoactividad atributoactividad;
    @JoinColumn(name = "EvaluacionAtributo_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Evaluacionatributo evaluacionatributo;
    @JoinColumn(name = "Ponderacion_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ponderacion ponderacion;

    public Atributo() {
    }

    public Atributo(AtributoPK atributoPK) {
        this.atributoPK = atributoPK;
    }

    public Atributo(int id, int ponderacionid, int evaluacionAtributoid, int atributoActividadid, int atributoActividadActividadid, int atributoActividadActividadContenedorid, int atributoActividadActividadContenedorProcesoid) {
        this.atributoPK = new AtributoPK(id, ponderacionid, evaluacionAtributoid, atributoActividadid, atributoActividadActividadid, atributoActividadActividadContenedorid, atributoActividadActividadContenedorProcesoid);
    }

    public AtributoPK getAtributoPK() {
        return atributoPK;
    }

    public void setAtributoPK(AtributoPK atributoPK) {
        this.atributoPK = atributoPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getRequirido() {
        return requirido;
    }

    public void setRequirido(Short requirido) {
        this.requirido = requirido;
    }

    @XmlTransient
    public Collection<Categoriaatributo> getCategoriaatributoCollection() {
        return categoriaatributoCollection;
    }

    public void setCategoriaatributoCollection(Collection<Categoriaatributo> categoriaatributoCollection) {
        this.categoriaatributoCollection = categoriaatributoCollection;
    }

    public Atributoactividad getAtributoactividad() {
        return atributoactividad;
    }

    public void setAtributoactividad(Atributoactividad atributoactividad) {
        this.atributoactividad = atributoactividad;
    }

    public Evaluacionatributo getEvaluacionatributo() {
        return evaluacionatributo;
    }

    public void setEvaluacionatributo(Evaluacionatributo evaluacionatributo) {
        this.evaluacionatributo = evaluacionatributo;
    }

    public Ponderacion getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(Ponderacion ponderacion) {
        this.ponderacion = ponderacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atributoPK != null ? atributoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atributo)) {
            return false;
        }
        Atributo other = (Atributo) object;
        if ((this.atributoPK == null && other.atributoPK != null) || (this.atributoPK != null && !this.atributoPK.equals(other.atributoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Atributo[ atributoPK=" + atributoPK + " ]";
    }
    
}
