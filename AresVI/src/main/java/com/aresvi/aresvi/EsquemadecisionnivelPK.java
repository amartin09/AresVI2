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
public class EsquemadecisionnivelPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EsquemaDecision_id")
    private int esquemaDecisionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ponderacion_id")
    private int ponderacionid;

    public EsquemadecisionnivelPK() {
    }

    public EsquemadecisionnivelPK(int id, int esquemaDecisionid, int ponderacionid) {
        this.id = id;
        this.esquemaDecisionid = esquemaDecisionid;
        this.ponderacionid = ponderacionid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEsquemaDecisionid() {
        return esquemaDecisionid;
    }

    public void setEsquemaDecisionid(int esquemaDecisionid) {
        this.esquemaDecisionid = esquemaDecisionid;
    }

    public int getPonderacionid() {
        return ponderacionid;
    }

    public void setPonderacionid(int ponderacionid) {
        this.ponderacionid = ponderacionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) esquemaDecisionid;
        hash += (int) ponderacionid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EsquemadecisionnivelPK)) {
            return false;
        }
        EsquemadecisionnivelPK other = (EsquemadecisionnivelPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.esquemaDecisionid != other.esquemaDecisionid) {
            return false;
        }
        if (this.ponderacionid != other.ponderacionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aresvi.aresvi.EsquemadecisionnivelPK[ id=" + id + ", esquemaDecisionid=" + esquemaDecisionid + ", ponderacionid=" + ponderacionid + " ]";
    }
    
}
