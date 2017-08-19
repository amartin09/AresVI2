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
public class HistoricorolesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idHistoricoRoles")
    private int idHistoricoRoles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "roles_id")
    private int rolesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuarios_id")
    private int usuariosId;

    public HistoricorolesPK() {
    }

    public HistoricorolesPK(int idHistoricoRoles, int rolesId, int usuariosId) {
        this.idHistoricoRoles = idHistoricoRoles;
        this.rolesId = rolesId;
        this.usuariosId = usuariosId;
    }

    public int getIdHistoricoRoles() {
        return idHistoricoRoles;
    }

    public void setIdHistoricoRoles(int idHistoricoRoles) {
        this.idHistoricoRoles = idHistoricoRoles;
    }

    public int getRolesId() {
        return rolesId;
    }

    public void setRolesId(int rolesId) {
        this.rolesId = rolesId;
    }

    public int getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(int usuariosId) {
        this.usuariosId = usuariosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idHistoricoRoles;
        hash += (int) rolesId;
        hash += (int) usuariosId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricorolesPK)) {
            return false;
        }
        HistoricorolesPK other = (HistoricorolesPK) object;
        if (this.idHistoricoRoles != other.idHistoricoRoles) {
            return false;
        }
        if (this.rolesId != other.rolesId) {
            return false;
        }
        if (this.usuariosId != other.usuariosId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.HistoricorolesPK[ idHistoricoRoles=" + idHistoricoRoles + ", rolesId=" + rolesId + ", usuariosId=" + usuariosId + " ]";
    }
    
}
