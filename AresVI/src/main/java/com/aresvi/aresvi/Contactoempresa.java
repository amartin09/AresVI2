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
@Table(name = "contactoempresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactoempresa.findAll", query = "SELECT c FROM Contactoempresa c")
    , @NamedQuery(name = "Contactoempresa.findById", query = "SELECT c FROM Contactoempresa c WHERE c.id = :id")
    , @NamedQuery(name = "Contactoempresa.findByEmail", query = "SELECT c FROM Contactoempresa c WHERE c.email = :email")
    , @NamedQuery(name = "Contactoempresa.findByNombre", query = "SELECT c FROM Contactoempresa c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Contactoempresa.findByNota", query = "SELECT c FROM Contactoempresa c WHERE c.nota = :nota")
    , @NamedQuery(name = "Contactoempresa.findByPuesto", query = "SELECT c FROM Contactoempresa c WHERE c.puesto = :puesto")
    , @NamedQuery(name = "Contactoempresa.findByTelefono", query = "SELECT c FROM Contactoempresa c WHERE c.telefono = :telefono")})
public class Contactoempresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "nota")
    private String nota;
    @Size(max = 45)
    @Column(name = "puesto")
    private String puesto;
    @Column(name = "telefono")
    private Integer telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactoempresa")
    private Collection<Empresa> empresaCollection;

    public Contactoempresa() {
    }

    public Contactoempresa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
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
        if (!(object instanceof Contactoempresa)) {
            return false;
        }
        Contactoempresa other = (Contactoempresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Contactoempresa[ id=" + id + " ]";
    }
    
}
