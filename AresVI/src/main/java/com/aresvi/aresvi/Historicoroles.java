/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.aresvi;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariel
 */
@Entity
@Table(name = "historicoroles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historicoroles.findAll", query = "SELECT h FROM Historicoroles h")
    , @NamedQuery(name = "Historicoroles.findByIdHistoricoRoles", query = "SELECT h FROM Historicoroles h WHERE h.historicorolesPK.idHistoricoRoles = :idHistoricoRoles")
    , @NamedQuery(name = "Historicoroles.findByFechaDesde", query = "SELECT h FROM Historicoroles h WHERE h.fechaDesde = :fechaDesde")
    , @NamedQuery(name = "Historicoroles.findByFechaHasta", query = "SELECT h FROM Historicoroles h WHERE h.fechaHasta = :fechaHasta")
    , @NamedQuery(name = "Historicoroles.findByRolesId", query = "SELECT h FROM Historicoroles h WHERE h.historicorolesPK.rolesId = :rolesId")
    , @NamedQuery(name = "Historicoroles.findByUsuariosId", query = "SELECT h FROM Historicoroles h WHERE h.historicorolesPK.usuariosId = :usuariosId")})
public class Historicoroles implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoricorolesPK historicorolesPK;
    @Column(name = "fechaDesde")
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    @Column(name = "fechaHasta")
    @Temporal(TemporalType.DATE)
    private Date fechaHasta;
    @JoinColumn(name = "roles_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Roles roles;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarios;

    public Historicoroles() {
    }

    public Historicoroles(HistoricorolesPK historicorolesPK) {
        this.historicorolesPK = historicorolesPK;
    }

    public Historicoroles(int idHistoricoRoles, int rolesId, int usuariosId) {
        this.historicorolesPK = new HistoricorolesPK(idHistoricoRoles, rolesId, usuariosId);
    }

    public HistoricorolesPK getHistoricorolesPK() {
        return historicorolesPK;
    }

    public void setHistoricorolesPK(HistoricorolesPK historicorolesPK) {
        this.historicorolesPK = historicorolesPK;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historicorolesPK != null ? historicorolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historicoroles)) {
            return false;
        }
        Historicoroles other = (Historicoroles) object;
        if ((this.historicorolesPK == null && other.historicorolesPK != null) || (this.historicorolesPK != null && !this.historicorolesPK.equals(other.historicorolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.Historicoroles[ historicorolesPK=" + historicorolesPK + " ]";
    }
    
}
