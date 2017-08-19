/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.service;

import com.aresvi.aresvi.Atributoactividad;
import com.aresvi.aresvi.AtributoactividadPK;
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
@Path("com.aresvi.aresvi.atributoactividad")
public class AtributoactividadFacadeREST extends AbstractFacade<Atributoactividad> {

    @PersistenceContext(unitName = "com.mycompany_AresVI_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private AtributoactividadPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;actividadid=actividadidValue;actividadContenedorid=actividadContenedoridValue;actividadContenedorProcesoid=actividadContenedorProcesoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.aresvi.aresvi.AtributoactividadPK key = new com.aresvi.aresvi.AtributoactividadPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Integer(id.get(0)));
        }
        java.util.List<String> actividadid = map.get("actividadid");
        if (actividadid != null && !actividadid.isEmpty()) {
            key.setActividadid(new java.lang.Integer(actividadid.get(0)));
        }
        java.util.List<String> actividadContenedorid = map.get("actividadContenedorid");
        if (actividadContenedorid != null && !actividadContenedorid.isEmpty()) {
            key.setActividadContenedorid(new java.lang.Integer(actividadContenedorid.get(0)));
        }
        java.util.List<String> actividadContenedorProcesoid = map.get("actividadContenedorProcesoid");
        if (actividadContenedorProcesoid != null && !actividadContenedorProcesoid.isEmpty()) {
            key.setActividadContenedorProcesoid(new java.lang.Integer(actividadContenedorProcesoid.get(0)));
        }
        return key;
    }

    public AtributoactividadFacadeREST() {
        super(Atributoactividad.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Atributoactividad entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Atributoactividad entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.AtributoactividadPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Atributoactividad find(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.AtributoactividadPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Atributoactividad> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Atributoactividad> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
