/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "direccionempresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccionempresa.findAll", query = "SELECT d FROM Direccionempresa d")
    , @NamedQuery(name = "Direccionempresa.findById", query = "SELECT d FROM Direccionempresa d WHERE d.id = :id")
    , @NamedQuery(name = "Direccionempresa.findByCalle", query = "SELECT d FROM Direccionempresa d WHERE d.calle = :calle")
    , @NamedQuery(name = "Direccionempresa.findByCiudad", query = "SELECT d FROM Direccionempresa d WHERE d.ciudad = :ciudad")
    , @NamedQuery(name = "Direccionempresa.findByDatoAdicional", query = "SELECT d FROM Direccionempresa d WHERE d.datoAdicional = :datoAdicional")
    , @NamedQuery(name = "Direccionempresa.findByDepartameto", query = "SELECT d FROM Direccionempresa d WHERE d.departameto = :departameto")
    , @NamedQuery(name = "Direccionempresa.findByNumero", query = "SELECT d FROM Direccionempresa d WHERE d.numero = :numero")
    , @NamedQuery(name = "Direccionempresa.findByProvincia", query = "SELECT d FROM Direccionempresa d WHERE d.provincia = :provincia")})
public class Direccionempresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "calle")
    private String calle;
    @Size(max = 45)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 45)
    @Column(name = "datoAdicional")
    private String datoAdicional;
    @Size(max = 45)
    @Column(name = "departameto")
    private String departameto;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 45)
    @Column(name = "provincia")
    private String provincia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "direccionempresa")
    private Collection<Empresa> empresaCollection;

    public Direccionempresa() {
    }

    public Direccionempresa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    public String getDepartameto() {
        return departameto;
    }

    public void setDepartameto(String departameto) {
        this.departameto = departameto;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @XmlTransient
    public Collection<Empresa> getEmpresaCollection() {
        return empresaCollection;
    }

    public void setEmpresaCollection(Collection<Empresa> empresaCollection) {
        this.empresaCollection = empresaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccionempresa)) {
            return false;
        }
        Direccionempresa other = (Direccionempresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Direccionempresa[ id=" + id + " ]";
    }
    
}
