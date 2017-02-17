package hei.tp06.web.controller;

import hei.tp06.core.entity.Evenement;

import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface RestController {
    @GET
    @Path("/evenements/{idEvent}")
    Evenement getEvenement(@PathParam("idEvent") Long id);

    @GET
    @Path("/evenements")
    List<Evenement> getEvenements();

    @POST
    @Path("/evenements")
    @Consumes("application/json")
    Response postEvenements(Evenement evenement);
}
