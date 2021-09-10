package com.projeto.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("rascunho")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RascunhoREST {

    @GET
    public Response testaREST(@QueryParam String param) {
        return Response.ok("Teste funcional!", MediaType.TEXT_PLAIN).build();
    }

}
