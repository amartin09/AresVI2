/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aresvi.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ariel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.aresvi.service.ActividadFacadeREST.class);
        resources.add(com.aresvi.service.AtributoFacadeREST.class);
        resources.add(com.aresvi.service.AtributoactividadFacadeREST.class);
        resources.add(com.aresvi.service.AuditoriaFacadeREST.class);
        resources.add(com.aresvi.service.CategoriaatributoFacadeREST.class);
        resources.add(com.aresvi.service.ContactoempresaFacadeREST.class);
        resources.add(com.aresvi.service.ContenedorFacadeREST.class);
        resources.add(com.aresvi.service.DireccionempresaFacadeREST.class);
        resources.add(com.aresvi.service.EmpresaFacadeREST.class);
        resources.add(com.aresvi.service.EsquemadecisionFacadeREST.class);
        resources.add(com.aresvi.service.EsquemadecisionnivelFacadeREST.class);
        resources.add(com.aresvi.service.EvaluacionatributoFacadeREST.class);
        resources.add(com.aresvi.service.HistoricorolesFacadeREST.class);
        resources.add(com.aresvi.service.PonderacionFacadeREST.class);
        resources.add(com.aresvi.service.ProcesoFacadeREST.class);
        resources.add(com.aresvi.service.RecomendacionprocesoFacadeREST.class);
        resources.add(com.aresvi.service.RolesFacadeREST.class);
        resources.add(com.aresvi.service.UsuariosFacadeREST.class);
    }
    
}
