/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.service;

import com.aresvi.aresvi.Recomendacionproceso;
import com.aresvi.aresvi.RecomendacionprocesoPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author ariel
 */
@Stateless
@Path("com.aresvi.aresvi.recomendacionproceso")
public class RecomendacionprocesoFacadeREST extends AbstractFacade<Recomendacionproceso> {

    @PersistenceContext(unitName = "com.mycompany_AresVI_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private RecomendacionprocesoPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;evaluacionAtributoid=evaluacionAtributoidValue;procesoid=procesoidValue;auditoriaid=auditoriaidValue;auditoriaEmpresaid=auditoriaEmpresaidValue;auditoriaProcesoid=auditoriaProcesoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.aresvi.aresvi.RecomendacionprocesoPK key = new com.aresvi.aresvi.RecomendacionprocesoPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Integer(id.get(0)));
        }
        java.util.List<String> evaluacionAtributoid = map.get("evaluacionAtributoid");
        if (evaluacionAtributoid != null && !evaluacionAtributoid.isEmpty()) {
            key.setEvaluacionAtributoid(new java.lang.Integer(evaluacionAtributoid.get(0)));
        }
        java.util.List<String> procesoid = map.get("procesoid");
        if (procesoid != null && !procesoid.isEmpty()) {
            key.setProcesoid(new java.lang.Integer(procesoid.get(0)));
        }
        java.util.List<String> auditoriaid = map.get("auditoriaid");
        if (auditoriaid != null && !auditoriaid.isEmpty()) {
            key.setAuditoriaid(new java.lang.Integer(auditoriaid.get(0)));
        }
        java.util.List<String> auditoriaEmpresaid = map.get("auditoriaEmpresaid");
        if (auditoriaEmpresaid != null && !auditoriaEmpresaid.isEmpty()) {
            key.setAuditoriaEmpresaid(new java.lang.Integer(auditoriaEmpresaid.get(0)));
        }
        java.util.List<String> auditoriaProcesoid = map.get("auditoriaProcesoid");
        if (auditoriaProcesoid != null && !auditoriaProcesoid.isEmpty()) {
            key.setAuditoriaProcesoid(new java.lang.Integer(auditoriaProcesoid.get(0)));
        }
        return key;
    }

    public RecomendacionprocesoFacadeREST() {
        super(Recomendacionproceso.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Recomendacionproceso entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Recomendacionproceso entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.RecomendacionprocesoPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Recomendacionproceso find(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.RecomendacionprocesoPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Recomendacionproceso> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Recomendacionproceso> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
