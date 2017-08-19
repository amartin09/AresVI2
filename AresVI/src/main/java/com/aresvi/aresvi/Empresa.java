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
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findById", query = "SELECT e FROM Empresa e WHERE e.empresaPK.id = :id")
    , @NamedQuery(name = "Empresa.findByActividad", query = "SELECT e FROM Empresa e WHERE e.actividad = :actividad")
    , @NamedQuery(name = "Empresa.findByCuit", query = "SELECT e FROM Empresa e WHERE e.cuit = :cuit")
    , @NamedQuery(name = "Empresa.findByNombre", query = "SELECT e FROM Empresa e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empresa.findByObservaciones", query = "SELECT e FROM Empresa e WHERE e.observaciones = :observaciones")
    , @NamedQuery(name = "Empresa.findByContactoEmpresaid", query = "SELECT e FROM Empresa e WHERE e.empresaPK.contactoEmpresaid = :contactoEmpresaid")
    , @NamedQuery(name = "Empresa.findByDireccionEmpresaid", query = "SELECT e FROM Empresa e WHERE e.empresaPK.direccionEmpresaid = :direccionEmpresaid")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpresaPK empresaPK;
    @Size(max = 45)
    @Column(name = "actividad")
    private String actividad;
    @Column(name = "cuit")
    private Integer cuit;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private Collection<Auditoria> auditoriaCollection;
    @JoinColumn(name = "ContactoEmpresa_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contactoempresa contactoempresa;
    @JoinColumn(name = "DireccionEmpresa_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Direccionempresa direccionempresa;

    public Empresa() {
    }

    public Empresa(EmpresaPK empresaPK) {
        this.empresaPK = empresaPK;
    }

    public Empresa(int id, int contactoEmpresaid, int direccionEmpresaid) {
        this.empresaPK = new EmpresaPK(id, contactoEmpresaid, direccionEmpresaid);
    }

    public EmpresaPK getEmpresaPK() {
        return empresaPK;
    }

    public void setEmpresaPK(EmpresaPK empresaPK) {
        this.empresaPK = empresaPK;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public Collection<Auditoria> getAuditoriaCollection() {
        return auditoriaCollection;
    }

    public void setAuditoriaCollection(Collection<Auditoria> auditoriaCollection) {
        this.auditoriaCollection = auditoriaCollection;
    }

    public Contactoempresa getContactoempresa() {
        return contactoempresa;
    }

    public void setContactoempresa(Contactoempresa contactoempresa) {
        this.contactoempresa = contactoempresa;
    }

    public Direccionempresa getDireccionempresa() {
        return direccionempresa;
    }

    public void setDireccionempresa(Direccionempresa direccionempresa) {
        this.direccionempresa = direccionempresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empresaPK != null ? empresaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.empresaPK == null && other.empresaPK != null) || (this.empresaPK != null && !this.empresaPK.equals(other.empresaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Empresa[ empresaPK=" + empresaPK + " ]";
    }
    
}
