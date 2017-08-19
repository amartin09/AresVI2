/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.service;

import com.aresvi.aresvi.Atributo;
import com.aresvi.aresvi.AtributoPK;
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
@Path("com.aresvi.aresvi.atributo")
public class AtributoFacadeREST extends AbstractFacade<Atributo> {

    @PersistenceContext(unitName = "com.mycompany_AresVI_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private AtributoPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;ponderacionid=ponderacionidValue;evaluacionAtributoid=evaluacionAtributoidValue;atributoActividadid=atributoActividadidValue;atributoActividadActividadid=atributoActividadActividadidValue;atributoActividadActividadContenedorid=atributoActividadActividadContenedoridValue;atributoActividadActividadContenedorProcesoid=atributoActividadActividadContenedorProcesoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.aresvi.aresvi.AtributoPK key = new com.aresvi.aresvi.AtributoPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Integer(id.get(0)));
        }
        java.util.List<String> ponderacionid = map.get("ponderacionid");
        if (ponderacionid != null && !ponderacionid.isEmpty()) {
            key.setPonderacionid(new java.lang.Integer(ponderacionid.get(0)));
        }
        java.util.List<String> evaluacionAtributoid = map.get("evaluacionAtributoid");
        if (evaluacionAtributoid != null && !evaluacionAtributoid.isEmpty()) {
            key.setEvaluacionAtributoid(new java.lang.Integer(evaluacionAtributoid.get(0)));
        }
        java.util.List<String> atributoActividadid = map.get("atributoActividadid");
        if (atributoActividadid != null && !atributoActividadid.isEmpty()) {
            key.setAtributoActividadid(new java.lang.Integer(atributoActividadid.get(0)));
        }
        java.util.List<String> atributoActividadActividadid = map.get("atributoActividadActividadid");
        if (atributoActividadActividadid != null && !atributoActividadActividadid.isEmpty()) {
            key.setAtributoActividadActividadid(new java.lang.Integer(atributoActividadActividadid.get(0)));
        }
        java.util.List<String> atributoActividadActividadContenedorid = map.get("atributoActividadActividadContenedorid");
        if (atributoActividadActividadContenedorid != null && !atributoActividadActividadContenedorid.isEmpty()) {
            key.setAtributoActividadActividadContenedorid(new java.lang.Integer(atributoActividadActividadContenedorid.get(0)));
        }
        java.util.List<String> atributoActividadActividadContenedorProcesoid = map.get("atributoActividadActividadContenedorProcesoid");
        if (atributoActividadActividadContenedorProcesoid != null && !atributoActividadActividadContenedorProcesoid.isEmpty()) {
            key.setAtributoActividadActividadContenedorProcesoid(new java.lang.Integer(atributoActividadActividadContenedorProcesoid.get(0)));
        }
        return key;
    }

    public AtributoFacadeREST() {
        super(Atributo.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Atributo entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Atributo entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.AtributoPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Atributo find(@PathParam("id") PathSegment id) {
        com.aresvi.aresvi.AtributoPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Atributo> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Atributo> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
