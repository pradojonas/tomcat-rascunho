package com.projeto.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.process.internal.RequestScoped;

@Path("rascunho")
@RequestScoped
public class RascunhoREST {

    @Context
    HttpHeaders headers;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response testaREST(@DefaultValue("VAZIO") @QueryParam("param") String param) {
        return Response.ok("Teste funcional para parâmetro: " + param)
                       .build();
    }

}
