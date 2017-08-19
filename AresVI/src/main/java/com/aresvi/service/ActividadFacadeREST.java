/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.service;

import com.aresvi.aresvi.Actividad;
import com.aresvi.aresvi.ActividadPK;
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
@Path("com.aresvi.aresvi.actividad")
public class ActividadFacadeREST extends AbstractFacade<Actividad> {

    @PersistenceContext(unitName = "com.mycompany_AresVI_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private ActividadPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;contenedorid=contenedoridValue;contenedorProcesoid=contenedorProcesoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.aresvi.aresvi.ActividadPK key = new com.aresvi.aresvi.ActividadPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Integer(id.get(0)));
        }
        java.util.List<String> contenedorid = map.get("contenedorid");
        if (contenedorid != null && !contenedorid.isEmpty()) {
            key.setContenedorid(new java.lang.Integer(contenedorid.get(0)));
        }
        java.util.List<String> contenedorProcesoid = map.get("contenedorProcesoid");
        if (contenedorProcesoid != null && !contenedorProcesoid.isEmpty()) {
            key.setContenedorProcesoid(new java.lang.Integer(contenedorProcesoid.get(0)));
        }
        return key;
    }

    public ActividadFacadeREST() {
        super(Actividad.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Actividad entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Actividad entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.ActividadPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Actividad find(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.ActividadPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Actividad> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Actividad> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
